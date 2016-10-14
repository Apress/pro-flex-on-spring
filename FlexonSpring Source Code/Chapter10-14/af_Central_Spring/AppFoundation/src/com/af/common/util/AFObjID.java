package com.af.common.util;

import java.util.Date;

/******************************************************************************
*                                                                             *
*   File:           AFObjID.java                                              *
*                                                                             *
*   Description:    AFObjectID implementation.                                *
*                                                                             *
*   Modification Log:                                                         *
*                                                                             *
* Copyright© 2007 AppFoundation.                                              *
******************************************************************************/
public class AFObjID 
{
	// Singleton instance
	private static AFObjID myInstance;
	
	public static int serverID = 0;
	private static long m_lastTime = 0;
	private static int m_milli = 0;

    /**************************************************************************
    * %METHOD: AFObjID
    *
    * %DESCRIPTION: Constructor
    ***************************************************************************/
    private AFObjID(){}
    
    /**************************************************************************
     * %METHOD: getInstance
     *
     * %DESCRIPTION: Constructor
     ***************************************************************************/
    public static AFObjID getInstance() 
    {
        if (myInstance == null)
            myInstance = new AFObjID();

        return myInstance;
    }

    /**************************************************************************
     * %METHOD: NewObjectIdentifier
     *
     * %DESCRIPTION: Generate a new unique objectIdentifier
     ***************************************************************************/
	public static long NewObjectIdentifier()
	{
	 	Date    aTime = new Date();
	 	int     i;
	 	long	newObjectID;
	 	long	baseID;
	 	long 	systemTime;
	 	String  szWork;
	 	
	 	// Get system time (based on seconds since 1/1/1970)
	 	 systemTime = aTime.getTime();
	
	 	// Adjust milli
	 	if (systemTime > m_lastTime)
	 	  {
	 	    m_lastTime = systemTime;
	 	    // This condition is so almost all IDs don't end with the last
	 	    // three digits zero or very close to zero
	 	    if (m_milli > (999 / 4))
	 	      m_milli = 0;
	 	  }
	 	else
	 	  {
	 	    // If seconds haven't changed, there is a chance of dup ID
	 	    // generation, so force unique ID by waiting. This should be very
	 	    // rare - if a very fast machine causes this to happen with any
	 	    // frequency, the size of the sequence number m_milli will need to
	 	    // be expanded (the size of the generated IDs will increase also).
	 	    // Note that the max growth of m_milli defines the maximum number
	 	    // of unique IDs that can be generated per second, and that when
	 	    // that limit is reached this routine will force a wait to the
	 	    // next second to ensure uniqueness.
	 	    if (999 < m_milli)
	 	      {
		 		while (systemTime <= m_lastTime)
		 		  {
		 			//Thread.sleep(100);
		 			aTime = new Date();
		 			systemTime = aTime.getTime();
		 		  }
	 			m_milli = 0;
	 	      }
	 	  }
	
	 	i = m_milli++;
	 	
	    // Result is # seconds since base with server ID & sequence appended.
	 	baseID = systemTime;
	 	szWork = String.valueOf(baseID) + String.valueOf(((serverID * 1000) + i));
	
	 	newObjectID = Long.valueOf(szWork).longValue();

	 	return newObjectID;
	 }   
}


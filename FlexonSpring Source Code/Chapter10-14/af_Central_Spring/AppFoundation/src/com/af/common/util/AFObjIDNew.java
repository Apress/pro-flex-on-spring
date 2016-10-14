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
public class AFObjIDNew 
{
	// Singleton instance
	private static AFObjIDNew myInstance;
	
	public static int varianceID = 0;
	private static long previousTime = 0;
	private static int currentTime = 0;

    private AFObjIDNew(){}
    
    public static AFObjIDNew getInstance() 
    {
        if (myInstance == null)
            myInstance = new AFObjIDNew();

        return myInstance;
    }

	public static long NewObjectIdentifier()
	{
	 	Date    aTime = new Date();
	 	int     i;
	 	long	newObjectID;
	 	long	baseID;
	 	long 	systemTime;
	 	String  calculatedID;
	 	
	 	// Get system time
	 	systemTime = aTime.getTime();
	
	 	// Adjust currentTime
 	    // Check if seconds have not changed to not create a duplicate ID.
 	    if (999 < currentTime)
 	    {
	 		  while (systemTime <= previousTime)
	 		  {
	 			aTime = new Date();
	 			systemTime = aTime.getTime();
	 		  }
	          currentTime = 0;
 	    }
	 	  
	
	 	i = currentTime++;
	 	
	    // Result in base seconds with identifier appended
	 	baseID = systemTime;
	 	calculatedID = String.valueOf(baseID) + String.valueOf(((varianceID * 1000) + i));
	
	 	newObjectID = Long.valueOf(calculatedID).longValue();

	 	return newObjectID;
	 }   
}
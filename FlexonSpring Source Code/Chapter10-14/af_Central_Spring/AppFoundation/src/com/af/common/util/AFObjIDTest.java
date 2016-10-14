package com.af.common.util;

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
class AFObjIDTest 
{	
    /**************************************************************************
    * %METHOD: main
    *
    * %DESCRIPTION: Main driver for the application
    ***************************************************************************/
    public static void main(String[] args) 
    {	
      	// Get the server ID or the ID passed in from an application

    	AFObjID aSingleton = AFObjID.getInstance();
       
       int n = 1500;
        for ( int i=0; i<n; i++ )
        {
        	System.out.println(aSingleton.NewObjectIdentifier());
        }
    }

    /**************************************************************************
    * %METHOD: AFObjID
    *
    * %DESCRIPTION: Constructor
    ***************************************************************************/
    private AFObjIDTest()
    {
    
    } 
}


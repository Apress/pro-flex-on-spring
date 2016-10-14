package com.af.clientmanager.model
{
 	import com.adobe.cairngorm.model.ModelLocator;
 	import com.af.clientmanager.model.vo.*;
 	
 	import mx.collections.ArrayCollection;
 	
 	[Bindable]   
	public class ModelLocator implements com.adobe.cairngorm.model.ModelLocator
	{
		private static var modelLocator : com.af.clientmanager.model.ModelLocator;
	
		public static function getInstance() : com.af.clientmanager.model.ModelLocator 
		{
	 		if ( modelLocator == null )
				modelLocator = new com.af.clientmanager.model.ModelLocator();
				 
			return modelLocator;
	    }

	   	public function ModelLocator() 
	   	{
	   		if ( com.af.clientmanager.model.ModelLocator.modelLocator != null )
					throw new Error( "Only one ModelLocator instance should be instantiated" );	
	   	}	   	
	   	
	   	public const SERVICE_ENDPOINT = "http://localhost:8080/blazeds/spring/messagebroker/amf";
	   	//"http://localhost:8080/af_Central/messagebroker/amf";
	   	
	   	//Global Menu Constants
	   	public const CLIENT_MANAGER:int = 0;
	   	public const PROJECT_ADMIN:int = 1;
	   	public const DASHBOARD:int = 2;
		public var MainViewStackState:int = 0;
		
		// Data Providers
		public var clientsDP:ArrayCollection = new ArrayCollection();
		public var contactsDP:ArrayCollection = new ArrayCollection();
		public var issuesDP:ArrayCollection = new ArrayCollection();
		public var documentsDP:ArrayCollection = new ArrayCollection();
		
		public var selectedClient:ClientVO;
		public var selectedContact:ClientContactsVO;
	}	
}
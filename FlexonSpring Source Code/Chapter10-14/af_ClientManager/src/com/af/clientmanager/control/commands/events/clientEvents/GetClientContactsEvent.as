package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;

	public class GetClientContactsEvent extends CairngormEvent
	{
		public static const EVENT_GET_CLIENT_CONTACTS:String = "event_get_client_contacts";
		public var key:Number;
		
		public function GetClientContactsEvent(key:Number):void
		{
			super(EVENT_GET_CLIENT_CONTACTS);
			this.key = key;
		}	
	}
}
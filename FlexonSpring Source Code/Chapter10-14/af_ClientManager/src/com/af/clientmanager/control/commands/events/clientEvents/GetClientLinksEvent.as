package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;

	public class GetClientLinksEvent extends CairngormEvent
	{
		public static const EVENT_GET_CLIENT_LINKS:String = "event_get_client_links";
		public var key:Number;
		
		public function GetClientLinksEvent(key:Number):void
		{
			super(EVENT_GET_CLIENT_LINKS);
			this.key = key;
		}	
	}
}
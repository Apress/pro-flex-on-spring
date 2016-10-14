package com.af.clientmanager.control.commands.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;

	public class GetClientsEvent extends CairngormEvent
	{
		public static const EVENT_GET_CLIENTS:String = "event_get_clients";
		public function GetClientsEvent():void
		{
			super(EVENT_GET_CLIENTS);
		}	
	}
}
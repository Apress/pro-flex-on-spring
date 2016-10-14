package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;
	import com.af.clientmanager.model.vo.ClientVO;

	public class InsertClientEvent extends CairngormEvent 
	{
		public static const EVENT_INSERT_CLIENT:String = "event_insert_client";
		public var clientVO : ClientVO;

		public function InsertClientEvent( clientVO : ClientVO ) 
		{
			super( EVENT_INSERT_CLIENT );
			this.clientVO = clientVO;
		}
	}	
}
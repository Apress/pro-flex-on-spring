package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;
	import com.af.clientmanager.model.vo.ClientContactsVO;

	public class InsertClientContactEvent extends CairngormEvent 
	{
		public static const EVENT_INSERT_CLIENT_CONTACT:String = "event_insert_client_contact";
		public var clientContactVO : ClientContactsVO;

		public function InsertClientContactEvent( clientContactVO : ClientContactsVO ) 
		{
			super( EVENT_INSERT_CLIENT_CONTACT );
			this.clientContactVO = clientContactVO;
		}
	}	
}
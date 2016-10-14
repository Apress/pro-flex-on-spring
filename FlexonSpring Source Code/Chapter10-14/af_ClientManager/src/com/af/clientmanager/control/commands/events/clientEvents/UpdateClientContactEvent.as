package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;
	import com.af.clientmanager.model.vo.ClientContactsVO;


	public class UpdateClientContactEvent extends CairngormEvent 
	{
		public static const EVENT_UPDATE_CLIENT_CONTACT:String = "event_update_client_contact";
		public var clientContactVO : ClientContactsVO;

		public function UpdateClientContactEvent( clientContactVO : ClientContactsVO ) 
		{
			super( EVENT_UPDATE_CLIENT_CONTACT );
			this.clientContactVO = clientContactVO;
		}
	}	
}
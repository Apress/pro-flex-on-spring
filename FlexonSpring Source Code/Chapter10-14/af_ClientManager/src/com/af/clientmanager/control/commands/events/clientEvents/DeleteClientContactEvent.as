package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;
	import com.af.clientmanager.model.vo.ClientContactsVO;


	public class DeleteClientContactEvent extends CairngormEvent 
	{
		public static const EVENT_DELETE_CLIENT_CONTACT:String = "event_delete_client_contact";
		public var clientContactVO : ClientContactsVO;

		public function DeleteClientContactEvent( clientContactVO : ClientContactsVO ) 
		{
			super( EVENT_DELETE_CLIENT_CONTACT );
			this.clientContactVO = clientContactVO;
		}
	}	
}
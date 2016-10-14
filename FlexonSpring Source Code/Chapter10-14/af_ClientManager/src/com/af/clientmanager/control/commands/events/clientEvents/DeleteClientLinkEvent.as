package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.model.vo.ClientLinksVO;

	public class DeleteClientLinkEvent extends CairngormEvent 
	{
		public static const EVENT_DELETE_CLIENT_LINK:String = "event_delete_client_link";
		public var clientLinkVO : ClientLinksVO;

		public function DeleteClientLinkEvent( clientLinkVO : ClientLinksVO ) 
		{
			super( EVENT_DELETE_CLIENT_LINK );
			this.clientLinkVO = clientLinkVO;
		}
	}	
}
package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;
	import com.af.clientmanager.model.vo.ClientLinksVO;

	public class UpdateClientLinkEvent extends CairngormEvent 
	{
		public static const EVENT_UPDATE_CLIENT_LINK:String = "event_update_client_link";
		public var clientLinkVO : ClientLinksVO;

		public function UpdateClientLinkEvent( clientLinkVO : ClientLinksVO ) 
		{
			super( EVENT_UPDATE_CLIENT_LINK );
			this.clientLinkVO = clientLinkVO;
		}
	}	
}
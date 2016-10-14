package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;
	import com.af.clientmanager.model.vo.ClientLinksVO;

	public class InsertClientLinkEvent extends CairngormEvent 
	{
		public static const EVENT_INSERT_CLIENT_LINK:String = "event_insert_client_link";
		public var clientLinkVO : ClientLinksVO;

		public function InsertClientLinkEvent( clientLinkVO : ClientLinksVO ) 
		{
			super( EVENT_INSERT_CLIENT_LINK );
			this.clientLinkVO = clientLinkVO;
		}
	}	
}
package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;
	import com.af.clientmanager.model.vo.ClientVO;


	public class UpdateClientEvent extends CairngormEvent 
	{
		public static const EVENT_UPDATE_CLIENT:String = "event_update_client";
		public var clientVO : ClientVO;

		public function UpdateClientEvent( clientVO : ClientVO ) 
		{
			super( EVENT_UPDATE_CLIENT );
			this.clientVO = clientVO;
		}
	}	
}
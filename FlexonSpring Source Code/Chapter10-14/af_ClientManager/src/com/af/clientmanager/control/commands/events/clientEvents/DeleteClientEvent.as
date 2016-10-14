package com.af.clientmanager.control.commands.events.clientEvents
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.control.MainController;
	import com.af.clientmanager.model.vo.ClientVO;


	public class DeleteClientEvent extends CairngormEvent 
	{
		public static const EVENT_DELETE_CLIENT:String = "event_delete_client";
		public var clientVO : ClientVO;

		public function DeleteClientEvent( clientVO : ClientVO ) 
		{
			super( EVENT_DELETE_CLIENT );
			this.clientVO = clientVO;
		}
	}	
}
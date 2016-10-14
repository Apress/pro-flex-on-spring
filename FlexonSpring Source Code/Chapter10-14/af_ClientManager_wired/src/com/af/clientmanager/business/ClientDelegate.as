package com.af.clientmanager.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.af.clientmanager.model.vo.ClientVO;
	
	import mx.controls.Alert;
	import mx.rpc.AsyncToken;
	import mx.rpc.IResponder;
	
	public class ClientDelegate
	{
		private var responder : IResponder;
		private var service : Object;
				
		public function ClientDelegate( responder : IResponder )
		{
			this.service = ServiceLocator.getInstance().getService( "clientService" );
			this.responder = responder;
		}
		
		//Client
		public function getClients(): void
		{
			var call:AsyncToken = service.getClients();
 			call.addResponder( responder );
		}
		
		public function insertClient(clientVO : ClientVO ): void
		{
			var call:AsyncToken = service.insertClient(clientVO);
 			call.addResponder( responder );
		}
		
		public function deleteClient(clientVO : ClientVO ): void
		{
			var call:AsyncToken = service.deleteClient(clientVO);
 			call.addResponder( responder );
		}
		
		public function updateClient(clientVO : ClientVO ): void
		{
			var call:AsyncToken = service.updateClient(clientVO);
 			call.addResponder( responder );
		}
	}
}

package com.af.clientmanager.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.af.clientmanager.model.vo.ClientContactsVO;
	import com.af.clientmanager.model.vo.ClientLinksVO;
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
		
		public function insertClient(clientVO : ClientVO): void
		{
			var call:AsyncToken = service.insertClient(clientVO);
 			call.addResponder( responder );
		}
		
		public function deleteClient(clientVO : ClientVO): void
		{
			var call:AsyncToken = service.deleteClient(clientVO);
 			call.addResponder( responder );
		}
		
		public function updateClient(clientVO : ClientVO): void
		{
			var call:AsyncToken = service.updateClient(clientVO);
 			call.addResponder( responder );
		}
		
		//Client Contacts
		public function getClientContacts(key:Number): void
		{
			var call:AsyncToken = service.getClientContacts(key);
 			call.addResponder( responder );
		}
		
		public function insertClientContact(clientContactVO : ClientContactsVO): void
		{
			var call:AsyncToken = service.insertClientContact(clientContactVO);
 			call.addResponder( responder );
		}
		
		public function deleteClientContact(clientContactVO : ClientContactsVO): void
		{
			var call:AsyncToken = service.deleteClientContact(clientContactVO);
 			call.addResponder( responder );
		}
		
		public function updateClientContact(clientContactVO : ClientContactsVO): void
		{
			var call:AsyncToken = service.updateClientContact(clientContactVO);
 			call.addResponder( responder );
		}
		
		//Client Links
		public function getClientLinks(key:Number): void
		{
			var call:AsyncToken = service.getClientLinks(key);
 			call.addResponder( responder );
		}
		
		public function insertClientLink(clientlinkVO : ClientLinksVO): void
		{
			var call:AsyncToken = service.insertClientLink(clientlinkVO);
 			call.addResponder( responder );
		}
		
		public function deleteClientLink(clientlinkVO : ClientLinksVO):void
		{			
		    var call:AsyncToken = service.deleteClientLink(clientlinkVO);
 			call.addResponder( responder );
		}
		
		public function updateClientLink(clientlinkVO : ClientLinksVO): void
		{
			var call:AsyncToken = service.updateClientLink(clientlinkVO);
 			call.addResponder( responder );
		}
	}
}

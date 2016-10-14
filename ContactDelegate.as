package com.af.cep.model.business
{
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	import com.adobe.cairngorm.business.Responder;
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.af.cep.vo.ContactVO;
    import mx.controls.Alert;
	import flash.utils.setTimeout;
	
	import mx.rpc.AsyncToken;
	import mx.rpc.events.ResultEvent;
	
	public class ContactDelegate
	{
		private var responder : IResponder;
		private var service : Object;
				
		public function ContactDelegate( responder : IResponder )
		{
			this.service = ServiceLocator.getInstance().getService( "contactService" );
			this.responder = responder;
		}
		
		public function addContact( contactVO : ContactVO ): void
		{	
			// Use with IResponder
			//var call:AsyncToken = service.insertContact(contactVO);
 			//call.addResponder( responder );

			//for demo purpose: simulate remote service result
			setTimeout( addcontactResult, 1000, contactVO );
		}
		
		public function updateContact( contactVO : ContactVO ): void
		{		
			// Use with IResponder
			//var call:AsyncToken = service.updateContact(contactVO);
 			//call.addResponder( responder );

			//for demo purpose: simulate remote service result
			setTimeout( addcontactResult, 1000, contactVO );
		}
		
		public function deleteContact( contactVO : ContactVO ): void
		{
			// Use with IResponder
			//var call:AsyncToken = service.deleteContact(contactVO.objectIdentifier);
 			//call.addResponder( responder );

			//for demo purpose: simulate remote service result
			setTimeout( addcontactResult, 1000, contactVO );
		}
		
		public function getContacts(): void
		{
			// Use with IResponder
			//var call:AsyncToken = service.getContacts();
 			//call.addResponder( responder );

			//for demo purpose: simulate remote service result
			setTimeout( addcontactResult, 1000);
		}
		
		private function addcontactResult( contactVO : ContactVO ): void
		{
			if( 1 )
			{
				responder.result( contactVO );
			}
			else
			{
				responder.fault(FaultEvent);
			}			
		}	
	}
}

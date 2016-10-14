package com.af.cep.commands
{
	import mx.rpc.events.ResultEvent;
	import mx.rpc.IResponder;
	import mx.collections.ArrayCollection;
		
	import com.adobe.cairngorm.business.Responder;
	import com.adobe.cairngorm.commands.Command;
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import com.af.cep.model.business.ContactDelegate;
	import com.af.cep.commands.events.GetContactsEvent;
	import com.af.cep.model.ModelLocator;
	import com.af.cep.vo.ContactVO;
	
	public class GetContactsCommand implements Command, IResponder
	{
		private var model : ModelLocator = ModelLocator.getInstance();

		public function execute( event : CairngormEvent ) : void
		{
			model.addcontact.isPending = true;
			
			var delegate : ContactDelegate = new ContactDelegate( this );   
			var getContactsEvent : GetContactsEvent = GetContactsEvent( event );  
			delegate.getContacts();      
		}
		   
		public function result( data:Object ) : void
		{			
			var event:ResultEvent = data as ResultEvent;

			model.addcontact.isPending = false;
			model.contacts = ArrayCollection(event.result);
		}
				
		public function fault( info:Object ) : void
		{
			model.addcontact.statusMessage = "Could not send contact information to the server.";
			model.addcontact.isPending = false;
		}
	}
}
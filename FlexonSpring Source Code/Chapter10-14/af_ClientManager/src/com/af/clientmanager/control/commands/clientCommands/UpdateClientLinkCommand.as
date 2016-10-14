package com.af.clientmanager.control.commands.clientCommands
{
	import com.adobe.cairngorm.commands.Command;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.clientEvents.UpdateClientLinkEvent;
	import com.af.clientmanager.model.ModelLocator;
	import com.af.clientmanager.model.vo.ClientLinksVO;
	
	import mx.rpc.IResponder;
	import mx.rpc.events.ResultEvent;

	public class UpdateClientLinkCommand implements Command, IResponder
	{
		private var model : ModelLocator = ModelLocator.getInstance();

		public function execute( event : CairngormEvent ) : void
		{
			var delegate : ClientDelegate = new ClientDelegate( this );   
			var updateClientLinkEvent : UpdateClientLinkEvent = UpdateClientLinkEvent( event );  
			delegate.updateClientLink( updateClientLinkEvent.clientLinkVO );      
		}
		   
		public function result( data:Object ) : void
		{	
			var event:ResultEvent = data as ResultEvent;
		//	model.clientsDP.addItem(ClientVO(data));
		}
				
		public function fault( info:Object ) : void
		{
		//	model.addcontact.statusMessage = "Could not send contact information to the server.";
		//	model.addcontact.isPending = false;
		}
	}
}
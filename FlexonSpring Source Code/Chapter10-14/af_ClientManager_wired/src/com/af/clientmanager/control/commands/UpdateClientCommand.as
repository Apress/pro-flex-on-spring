package com.af.clientmanager.control.commands
{
	import com.adobe.cairngorm.commands.Command;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.UpdateClientEvent;
	import com.af.clientmanager.model.ModelLocator;
	import com.af.clientmanager.model.vo.ClientVO;
	
	import mx.rpc.IResponder;
	import mx.rpc.events.ResultEvent;

	public class UpdateClientCommand implements Command, IResponder
	{
		private var model : ModelLocator = ModelLocator.getInstance();

		public function execute( event : CairngormEvent ) : void
		{
			var delegate : ClientDelegate = new ClientDelegate( this );   
			var updateClientEvent : UpdateClientEvent = UpdateClientEvent( event );  
			delegate.updateClient( updateClientEvent.clientVO );      
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
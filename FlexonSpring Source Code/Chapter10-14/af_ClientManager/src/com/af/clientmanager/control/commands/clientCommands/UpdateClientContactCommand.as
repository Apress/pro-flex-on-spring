package com.af.clientmanager.control.commands.clientCommands
{
	import com.adobe.cairngorm.commands.Command;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.clientEvents.UpdateClientContactEvent;
	import com.af.clientmanager.model.ModelLocator;
	import com.af.clientmanager.model.vo.ClientVO;
	
	import mx.rpc.IResponder;
	import mx.rpc.events.ResultEvent;

	public class UpdateClientContactCommand implements Command, IResponder
	{
		private var model : ModelLocator = ModelLocator.getInstance();

		public function execute( event : CairngormEvent ) : void
		{
			var delegate : ClientDelegate = new ClientDelegate( this );   
			var updateClientContactEvent : UpdateClientContactEvent = UpdateClientContactEvent( event );  
			delegate.updateClientContact( updateClientContactEvent.clientContactVO );      
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
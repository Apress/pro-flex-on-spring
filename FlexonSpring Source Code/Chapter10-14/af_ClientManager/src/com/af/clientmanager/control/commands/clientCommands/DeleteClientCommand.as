package com.af.clientmanager.control.commands.clientCommands
{
	import com.adobe.cairngorm.commands.Command;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.clientEvents.DeleteClientEvent;
	import com.af.clientmanager.model.ModelLocator;
	
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;

	public class DeleteClientCommand implements Command, IResponder
	{
		private var model : ModelLocator = ModelLocator.getInstance();

		public function execute( event : CairngormEvent ) : void
		{
			var delegate : ClientDelegate = new ClientDelegate( this );   
			var deleteClientEvent : DeleteClientEvent = DeleteClientEvent( event );  
			delegate.deleteClient( deleteClientEvent.clientVO );      
		}
		   
		public function result( data:Object ) : void
		{	
			var event:ResultEvent = data as ResultEvent;
			
			var arrLength:int = model.clientsDP.length;
	                  
	        // Business logic to remove client from the model ArrayCollection		
			for(var i:int =0; i < arrLength; i++)
			{
				if(model.selectedClient.objectIdentifier ==
				   model.clientsDP[i].objectIdentifier)
				{
					model.clientsDP.removeItemAt(i);
					break;
				}
			}
		}
				
		public function fault(event:Object):void
		{
			var faultEvt:FaultEvent = event as FaultEvent;
			Alert.show("ERROR: " + event.toString());
		}
	}
}
package com.af.clientmanager.control.commands.clientCommands
{
	import com.adobe.cairngorm.commands.Command;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.clientEvents.DeleteClientContactEvent;
	import com.af.clientmanager.model.ModelLocator;
	
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;

	public class DeleteClientContactCommand implements Command, IResponder
	{
		private var model : ModelLocator = ModelLocator.getInstance();

		public function execute( event : CairngormEvent ) : void
		{
			var delegate : ClientDelegate = new ClientDelegate( this );   
			var deleteClientContactEvent : DeleteClientContactEvent = DeleteClientContactEvent( event );  
			delegate.deleteClientContact( deleteClientContactEvent.clientContactVO );      
		}
		   
		public function result( data:Object ) : void
		{	
			var event:ResultEvent = data as ResultEvent;
			
			var arrLength:int = model.contactsDP.length;
			
			for(var i:int =0; i < arrLength; i++)
			{
				if(model.selectedContact.objectIdentifier ==
				   model.contactsDP[i].objectIdentifier)
				{
					model.contactsDP.removeItemAt(i);
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
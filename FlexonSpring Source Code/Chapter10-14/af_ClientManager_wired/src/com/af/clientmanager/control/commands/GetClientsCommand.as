package com.af.clientmanager.control.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.GetClientsEvent;
	import com.af.clientmanager.model.ModelLocator;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	public class GetClientsCommand implements ICommand, IResponder
	{
		private var model:ModelLocator = ModelLocator.getInstance();
		public function execute(event:CairngormEvent):void
		{
			var getClientsEvent:GetClientsEvent = GetClientsEvent(event);
			var delegate : ClientDelegate = new ClientDelegate( this );
			delegate.getClients();						
		}
		
		public function result(data:Object):void
		{
			model.clientsDP = ArrayCollection(data.result);
		}
		
		public function fault(event:Object):void
		{
			var faultEvt:FaultEvent = event as FaultEvent;
			Alert.show("ERROR: " + event.toString());
		}
	}
}
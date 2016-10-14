package com.af.clientmanager.control.commands.clientCommands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.clientEvents.GetClientContactsEvent;
	import com.af.clientmanager.model.ModelLocator;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	public class GetClientContactsCommand implements ICommand, IResponder
	{
		private var model:ModelLocator = ModelLocator.getInstance();
		public function execute(event:CairngormEvent):void
		{
			var getClientContactsEvent:GetClientContactsEvent = GetClientContactsEvent(event);
			var delegate : ClientDelegate = new ClientDelegate( this );
			delegate.getClientContacts(getClientContactsEvent.key);						
		}
		
		public function result(data:Object):void
		{
			model.contactsDP = ArrayCollection(data.result);
		}
		
		public function fault(event:Object):void
		{
			var faultEvt:FaultEvent = event as FaultEvent;
			Alert.show("ERROR: " + event.toString());
		}
	}
}
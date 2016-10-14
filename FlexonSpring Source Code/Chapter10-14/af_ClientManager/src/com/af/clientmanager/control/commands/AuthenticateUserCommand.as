package com.af.clientmanager.control.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.SecurityDelegate;
	import com.af.clientmanager.control.commands.events.AuthenticateUserEvent;
	import com.af.clientmanager.model.ModelLocator;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	public class AuthenticateUserCommand implements ICommand, IResponder
	{
		private var model:ModelLocator = ModelLocator.getInstance();
		public function execute(event:CairngormEvent):void
		{
			var authenticateUserEvent:AuthenticateUserEvent = AuthenticateUserEvent(event);
			var delegate : SecurityDelegate = new SecurityDelegate( this );
			delegate.authenticateUser(authenticateUserEvent.userName, authenticateUserEvent.password);					
		}
		
		public function result(data:Object):void
		{
			model.mainAppView = model.APPLICATION_VIEW;
		}
		
		public function fault(event:Object):void
		{
			var faultEvt:FaultEvent = event as FaultEvent;
			Alert.show("ERROR: " + faultEvt.fault);
		}
	}
}
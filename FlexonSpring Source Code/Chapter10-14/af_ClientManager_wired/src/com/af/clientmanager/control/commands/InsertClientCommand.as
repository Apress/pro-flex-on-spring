package com.af.clientmanager.control.commands
{
	import com.adobe.cairngorm.commands.Command;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.InsertClientEvent;
	import com.af.clientmanager.model.ModelLocator;
	import com.af.clientmanager.model.vo.ClientVO;
	
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;

	public class InsertClientCommand implements Command, IResponder
	{
		private var model : ModelLocator = ModelLocator.getInstance();

		public function execute( event : CairngormEvent ) : void
		{
			var delegate : ClientDelegate = new ClientDelegate( this );   
			var insertClientEvent : InsertClientEvent = InsertClientEvent( event );  
			delegate.insertClient( insertClientEvent.clientVO );      
		}
		   
		public function result( data:Object ) : void
		{	
			var event:ResultEvent = data as ResultEvent;
			model.clientsDP.addItem(ClientVO(data));
		}
				
		public function fault(event:Object):void
		{
			var faultEvt:FaultEvent = event as FaultEvent;
			Alert.show("ERROR: " + event.toString());
		}
	}
}
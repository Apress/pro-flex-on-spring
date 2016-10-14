package com.af.clientmanager.control.commands.clientCommands
{
	import com.adobe.cairngorm.commands.Command;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.clientmanager.business.ClientDelegate;
	import com.af.clientmanager.control.commands.events.clientEvents.InsertClientLinkEvent;
	import com.af.clientmanager.model.ModelLocator;
	import com.af.clientmanager.model.vo.ClientLinksVO;
	
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;

	public class InsertClientLinkCommand implements Command, IResponder
	{
		private var model : ModelLocator = ModelLocator.getInstance();

		public function execute( event : CairngormEvent ) : void
		{
			var delegate : ClientDelegate = new ClientDelegate( this );   
			var insertClientLinkEvent : InsertClientLinkEvent = InsertClientLinkEvent( event );  
			delegate.insertClientLink( insertClientLinkEvent.clientLinkVO );      
		}
		   
		public function result( data:Object ) : void
		{	
			var event:ResultEvent = data as ResultEvent;
			model.linksDP.addItem(ClientLinksVO(event.result));
			
			Alert.show("Link = " + ClientLinksVO(event.result).linkName);
		}
				
		public function fault(event:Object):void
		{
			var faultEvt:FaultEvent = event as FaultEvent;
			Alert.show("ERROR: " + event.toString());
		}
	}
}
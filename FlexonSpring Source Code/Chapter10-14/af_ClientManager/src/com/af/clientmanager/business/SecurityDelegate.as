package com.af.clientmanager.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	
	import mx.controls.Alert;
	import mx.rpc.AsyncToken;
	import mx.rpc.IResponder;
	
	public class SecurityDelegate
	{
		private var responder : IResponder;
		private var service : Object;
				
		public function SecurityDelegate( responder : IResponder )
		{
			this.service = ServiceLocator.getInstance().getService( "securityService" );
			this.responder = responder;
		}
		
		public function authenticateUser(userName:String, password:String): void
		{
			var call:AsyncToken = service.authenticateUser(userName, password);
 			call.addResponder( responder );
		} 
	}
}

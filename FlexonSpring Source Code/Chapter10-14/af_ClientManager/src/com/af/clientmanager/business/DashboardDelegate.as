package com.af.clientmanager.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.af.vo.*;
	
	import mx.rpc.AsyncToken;
	import mx.rpc.IResponder;
	
	public class DashboardDelegate
	{
		private var responder : IResponder;
		private var service : Object;
				
		public function DashboardDelegate( responder : IResponder )
		{
			this.service = ServiceLocator.getInstance().getService( "dashboardService" );
			this.responder = responder;
		}
	}
}

package com.af.clientmanager.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.af.clientmanager.model.vo.InvoiceDetailsVO;
	import com.af.clientmanager.model.vo.InvoicesVO;
	import com.af.clientmanager.model.vo.MediaVO;
	import com.af.vo.*;
	
	import mx.rpc.AsyncToken;
	import mx.rpc.IResponder;
	
	public class InvoiceDelegate
	{
		private var responder : IResponder;
		private var service : Object;
				
		public function InvoiceDelegate( responder : IResponder )
		{
			this.service = ServiceLocator.getInstance().getService( "invoiceService" );
			this.responder = responder;
		}
		
		// Media
		public function getMedia(key:Number): void
		{
			var call:AsyncToken = service.getMedia(key);
 			call.addResponder( responder );
		}
		
		public function insertMedia(media : MediaVO): void
		{
			var call:AsyncToken = service.insertMedia(media);
 			call.addResponder( responder );
		}
		
		public function deleteMedia(media : MediaVO): void
		{
			var call:AsyncToken = service.deleteMedia(media);
 			call.addResponder( responder );
		}
		
		public function updateMedia(media : MediaVO): void
		{
			var call:AsyncToken = service.updateMedia(media);
 			call.addResponder( responder );
		}
	}
}

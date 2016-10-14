package com.af.clientmanager.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.af.clientmanager.model.vo.InvoiceDetailsVO;
	import com.af.clientmanager.model.vo.InvoicesVO;
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
		
		// Invoices
		public function getInvoices(key:Number): void
		{
			var call:AsyncToken = service.getInvoices(key);
 			call.addResponder( responder );
		}
		
		public function insertInvoice(invoice : InvoicesVO): void
		{
			var call:AsyncToken = service.insertInvoice(invoice);
 			call.addResponder( responder );
		}
		
		public function deleteInvoice(invoice : InvoicesVO): void
		{
			var call:AsyncToken = service.deleteInvoice(invoice);
 			call.addResponder( responder );
		}
		
		public function updateInvoice(invoice : InvoicesVO): void
		{
			var call:AsyncToken = service.updateInvoice(invoice);
 			call.addResponder( responder );
		}
		
		// Invoice Details
		public function getInvoiceDetails(key:Number): void
		{
			var call:AsyncToken = service.getInvoiceDetails(key);
 			call.addResponder( responder );
		}
		
		public function insertInvoiceDetail(invoiceDetailVO : InvoiceDetailsVO): void
		{
			var call:AsyncToken = service.insertInvoiceDetail(invoiceDetailVO);
 			call.addResponder( responder );
		}
		
		public function deleteInvoiceDetail(invoiceDetailVO : InvoiceDetailsVO): void
		{
			var call:AsyncToken = service.deleteInvoiceDetail(invoiceDetailVO);
 			call.addResponder( responder );
		}
		
		public function updateInvoiceDetail(invoiceDetailVO : InvoiceDetailsVO): void
		{
			var call:AsyncToken = service.updateInvoiceDetail(invoiceDetailVO);
 			call.addResponder( responder );
		}
	}
}

package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.Invoices")]

	public class InvoicesVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var clientNumber:String;
		public var clientName:String;
		public var invoiceDate:Date;
		public var invoiceNumber:String;
		public var toBePaidUntil:Date;
		public var comments:String;
		public var percentDiscount:Number;
	}
}
package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.InvoiceDetails")]

	public class InvoiceDetailsVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var detail:String;
		public var quantity:int;
		public var unitPrice:Number;
	}
}
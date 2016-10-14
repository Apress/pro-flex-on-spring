package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.Address")]

	public class AddressVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var addressLine1:String;
		public var addressLine2:String;
		public var addressLine3:String;
		public var city:String;
		public var state:String;
		public var zipCode:String;
		public var type:String;
	}
}
package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.Phone")]

	public class PhoneVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var phoneNumber:String;
		public var type:String;
		public var link:String;
	}
}
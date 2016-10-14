package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.Client")]

	public class ClientVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var clientName:String;
		public var clientID:int;
		public var link:String;
		public var description:String;
		public var notes:String;
		public var phone:String;
		public var addressLine1:String;
		public var addressLine2:String;
		public var city:String;
		public var state:String;
		public var zip:String;
	}
}
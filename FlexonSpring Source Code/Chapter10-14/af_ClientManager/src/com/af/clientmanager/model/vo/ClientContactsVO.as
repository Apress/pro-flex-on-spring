package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.ClientContacts")]

	public class ClientContactsVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var contactName:String;
		public var responsibility:String;
		public var email:String;
		public var jobTitle:String;
		public var phoneWork:String;
		public var phoneCell:String;
		public var addressLine1:String;
		public var addressLine2:String;
		public var city:String;
		public var state:String;
		public var zip:String;
	}
}
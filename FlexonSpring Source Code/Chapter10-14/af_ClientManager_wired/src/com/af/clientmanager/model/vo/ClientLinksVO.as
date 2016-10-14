package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.ClientLinks")]

	public class ClientLinksVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var linkName:String;
		public var url:String;
	}
}
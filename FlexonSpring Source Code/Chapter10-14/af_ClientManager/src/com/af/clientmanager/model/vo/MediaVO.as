package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.Media")]

	public class MediaVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var creationDate:Date;
		public var mediaName:String;
		public var mediaDescription:String;
	}
}
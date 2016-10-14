package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.Issues")]

	public class IssuesVO
	{
		public var objectIdentifier:int;
		public var assocobjectID:int;
		public var issue:String;
		public var openDate:Date;
		public var closeDate:Date;
		public var issueStatus:String;
		public var issueDescription:String;
	}
}
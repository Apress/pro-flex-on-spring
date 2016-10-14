package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.Projects")]

	public class ProjectsVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var projectName:String;
		public var startDate:Date;
		public var endDate:Date;		
		public var projectSpace:String;
		public var projectNotes:String;
		public var projectScope:String;
		public var projectBusinessNeed:String;
		public var projectProcessFlow:String;

	}
}
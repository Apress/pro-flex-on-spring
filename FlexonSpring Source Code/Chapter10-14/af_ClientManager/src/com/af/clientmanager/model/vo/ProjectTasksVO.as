package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.ProjectTasks")]

	public class ProjectTasksVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var taskName:String;
		public var owner:String;
		public var progress:String;
		public var projectName:String;
		public var taskStatus:String;
		public var taskDescription:String;
		public var startDate:Date;
		public var endDate:Date;
	}
}
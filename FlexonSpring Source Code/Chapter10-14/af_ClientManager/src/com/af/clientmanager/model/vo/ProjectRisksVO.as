package com.af.clientmanager.model.vo
{
	[Bindable]
	[RemoteClass(alias="com.af.core.domain.ProjectRisks")]

	public class ProjectRisksVO
	{
		public var objectIdentifier:Number;
		public var assocobjectID:Number;
		public var risk:String;
		public var openDate:Date;
		public var closeDate:Date;
		public var riskStatus:String;
		public var riskDescription:String;
	}
}
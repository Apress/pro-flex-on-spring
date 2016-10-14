package com.af.clientmanager.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.af.clientmanager.model.vo.IssuesVO;
	import com.af.clientmanager.model.vo.ProjectRisksVO;
	import com.af.clientmanager.model.vo.ProjectTasksVO;
	import com.af.clientmanager.model.vo.ProjectsVO;
	import com.af.vo.*;
	
	import mx.rpc.AsyncToken;
	import mx.rpc.IResponder;
	
	public class ProjectDelegate
	{
		private var responder : IResponder;
		private var service : Object;
				
		public function ProjectDelegate( responder : IResponder )
		{
			this.service = ServiceLocator.getInstance().getService( "projectService" );
			this.responder = responder;
		}
		
		//Projects
		public function getProjects(key:Number): void
		{
			var call:AsyncToken = service.getProjects(key);
 			call.addResponder( responder );
		}
		
		public function insertProject(projectVO : ProjectsVO): void
		{
			var call:AsyncToken = service.insertProject(projectVO);
 			call.addResponder( responder );
		}
		
		public function deleteProject(projectVO : ProjectsVO): void
		{
			var call:AsyncToken = service.deleteProject(projectVO);
 			call.addResponder( responder );
		}
		
		public function updateProject(projectVO : ProjectsVO): void
		{
			var call:AsyncToken = service.updateProject(projectVO);
 			call.addResponder( responder );
		}
		
		//Project Tasks
		public function getProjectTasks(key:Number): void
		{
			var call:AsyncToken = service.getProjectTasks(key);
 			call.addResponder( responder );
		}
		
		public function insertProjectTask(projectTaskVO : ProjectTasksVO): void
		{
			var call:AsyncToken = service.insertProjectTask(projectTaskVO);
 			call.addResponder( responder );
		}
		
		public function deleteProjectTask(projectTaskVO : ProjectTasksVO): void
		{
			var call:AsyncToken = service.deleteProjectTask(projectTaskVO);
 			call.addResponder( responder );
		}
		
		public function updateProjectTask(projectTaskVO : ProjectTasksVO): void
		{
			var call:AsyncToken = service.updateProjectTask(projectTaskVO);
 			call.addResponder( responder );
		}
		
		//Project Risks
		public function getProjectRisks(key:Number): void
		{
			var call:AsyncToken = service.getProjectRisks(key);
 			call.addResponder( responder );
		}
		
		public function insertProjectRisk(projectRiskVO : ProjectRisksVO): void
		{
			var call:AsyncToken = service.insertProjectRisk(projectRiskVO);
 			call.addResponder( responder );
		}
		
		public function deleteProjectRisk(projectRiskVO : ProjectRisksVO):void
		{			
		    var call:AsyncToken = service.deleteProjectRisk(projectRiskVO);
 			call.addResponder( responder );
		}
		
		public function updateProjectRisk(projectRiskVO : ProjectRisksVO): void
		{
			var call:AsyncToken = service.updateProjectRisk(projectRiskVO);
 			call.addResponder( responder );
		}
		// Issues
		public function getIssues(key:Number): void
		{
			var call:AsyncToken = service.getIssues(key);
 			call.addResponder( responder );
		}
		
		public function insertIssue(issue : IssuesVO): void
		{
			var call:AsyncToken = service.insertIssue(issue);
 			call.addResponder( responder );
		}
		
		public function deleteIssue(issue : IssuesVO):void
		{			
		    var call:AsyncToken = service.deleteIssue(issue);
 			call.addResponder( responder );
		}
		
		public function updateIssue(issue : IssuesVO): void
		{
			var call:AsyncToken = service.updateIssue(issue);
 			call.addResponder( responder );
		}
	}
}

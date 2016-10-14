package com.af.core.services;

import com.af.core.domain.Issues;
import com.af.core.domain.ProjectRisks;
import com.af.core.domain.Projects;
import com.af.core.domain.ProjectTasks;

import java.util.List;

public interface ProjectService 
{
	// Projects
	List<Projects> getProjects(long key);
	
	void insertProject(Projects project);
	
	void deleteProject(Projects project);
	
	void updateProject(Projects project);
	
	// Project Tasks
	List<ProjectTasks> getProjectTasks(long key);
	
	void insertProjectTask(ProjectTasks projectTasks);
	
	void deleteProjectTask(ProjectTasks projectTasks);
	
	void updateProjectTask(ProjectTasks projectTasks);
	
	// Project Risks
	List<ProjectRisks> getProjectRisks(long key);
	
	void insertProjectRisk(ProjectRisks projectRisk);
	
	void deleteProjectRisk(ProjectRisks projectRisk);
	
	void updateProjectRisk(ProjectRisks projectRisk);
	
	// Issues
	List<Issues> getIssues(long key);
	
	void insertIssue(Issues issue);
	
	void deleteIssue(Issues issue);
	
	void updateIssue(Issues issue);
}
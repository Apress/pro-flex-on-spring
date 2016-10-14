package com.af.core.services;

import com.af.core.dao.ProjectDao;
import com.af.core.domain.Issues;
import com.af.core.domain.ProjectRisks;
import com.af.core.domain.ProjectTasks;
import com.af.core.domain.Projects;

import java.util.List;
import java.io.Serializable;

public class ProjectServiceImpl implements Serializable, ProjectService 
{	
	// injected by Spring
	ProjectDao projectDao; 
	
	public ProjectDao getProjectDao() {
		return projectDao;
	}
	
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	// Projects
	public List<Projects> getProjects(long key) {
		return projectDao.getProjects(key);
	}
	public void insertProject(Projects project) {	
		projectDao.insertProject(project);
	}
	public void deleteProject(Projects project) {
		projectDao.deleteProject(project);
	}
	public void updateProject(Projects project)  {
		projectDao.updateProject(project);
	}
	
	// Project Tasks
	public List<ProjectTasks> getProjectTasks(long key) {
		return projectDao.getProjectTasks(key);
	}
	public void insertProjectTask(ProjectTasks projectTask) {	
		projectDao.insertProjectTask(projectTask);
	}
	public void deleteProjectTask(ProjectTasks projectTask) {
		projectDao.deleteProjectTask(projectTask);
	}
	public void updateProjectTask(ProjectTasks projectTask)  {
		projectDao.updateProjectTask(projectTask);
	}
	
	// Project Risks
	public List<ProjectRisks> getProjectRisks(long key) {
		return projectDao.getProjectRisks(key);
	}
	public void insertProjectRisk(ProjectRisks projectRisk) {	
		projectDao.insertProjectRisk(projectRisk);
	}
	public void deleteProjectRisk(ProjectRisks projectRisk) {
		projectDao.deleteProjectRisk(projectRisk);
	}
	public void updateProjectRisk(ProjectRisks projectRisk)  {
		projectDao.updateProjectRisk(projectRisk);
	}
	
	// Issues
	public List<Issues> getIssues(long key) {
		return projectDao.getIssues(key);
	}
	public void insertIssue(Issues issue) {	
		projectDao.insertIssue(issue);
	}
	public void deleteIssue(Issues issue) {
		projectDao.deleteIssue(issue);
	}
	public void updateIssue(Issues issue)  {
		projectDao.updateIssue(issue);
	}
}
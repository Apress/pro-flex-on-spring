package com.af.core.dao;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.af.core.domain.Issues;
import com.af.core.domain.ProjectRisks;
import com.af.core.domain.ProjectTasks;
import com.af.core.domain.Projects;

public interface ProjectDao {
	
	//Projects
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<Projects> getProjects(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	Projects insertProject(Projects project);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteProject(Projects project);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateProject(Projects project);
	
	//Project Tasks
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<ProjectTasks> getProjectTasks(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	ProjectTasks insertProjectTask(ProjectTasks projectTasks);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteProjectTask(ProjectTasks projectTasks);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateProjectTask(ProjectTasks projectTasks);
	
	//Project Risks
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<ProjectRisks> getProjectRisks(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	ProjectRisks insertProjectRisk(ProjectRisks projectRisks);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteProjectRisk(ProjectRisks projectRisks);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateProjectRisk(ProjectRisks projectRisks);
	
	// Issues
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<Issues> getIssues(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	Issues insertIssue(Issues issue);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteIssue(Issues issue);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateIssue(Issues issue);
}

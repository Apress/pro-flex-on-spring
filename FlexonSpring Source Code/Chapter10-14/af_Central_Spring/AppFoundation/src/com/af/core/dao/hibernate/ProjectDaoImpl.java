package com.af.core.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.common.util.AFObjID;
import com.af.core.dao.ProjectDao;
import com.af.core.domain.Issues;
import com.af.core.domain.ProjectRisks;
import com.af.core.domain.ProjectTasks;
import com.af.core.domain.Projects;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class ProjectDaoImpl extends HibernateDaoSupport implements ProjectDao 
{   
	AFObjID aSingleton = AFObjID.getInstance();
	
	// Projects
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Projects> getProjects(long key){
		return getHibernateTemplate().find("from Projects where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public Projects insertProject(Projects project){
		project.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (Projects) getHibernateTemplate().merge(project);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteProject(Projects project){
		getHibernateTemplate().delete(project);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateProject(Projects project){
		getHibernateTemplate().delete(project);
	}
	
	// Project Tasks
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<ProjectTasks> getProjectTasks(long key){
		return getHibernateTemplate().find("from ProjectTasks where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public ProjectTasks insertProjectTask(ProjectTasks projectTasks){
		projectTasks.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (ProjectTasks) getHibernateTemplate().merge(projectTasks);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteProjectTask(ProjectTasks projectTasks){
		getHibernateTemplate().delete(projectTasks);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateProjectTask(ProjectTasks projectTasks){
		getHibernateTemplate().delete(projectTasks);
	}
	
	// Project Risks
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<ProjectRisks> getProjectRisks(long key){
		return getHibernateTemplate().find("from ProjectRisks where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public ProjectRisks insertProjectRisk(ProjectRisks projectRisks){
		projectRisks.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (ProjectRisks) getHibernateTemplate().merge(projectRisks);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteProjectRisk(ProjectRisks projectRisks){
		getHibernateTemplate().delete(projectRisks);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateProjectRisk(ProjectRisks projectRisks){
		getHibernateTemplate().delete(projectRisks);
	}
	
	// Issues
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Issues> getIssues(long key){
		return getHibernateTemplate().find("from Issues where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public Issues insertIssue(Issues issue){
		return (Issues) getHibernateTemplate().merge(issue);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteIssue(Issues issue){
		getHibernateTemplate().delete(issue);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateIssue(Issues issue){
		getHibernateTemplate().delete(issue);
	}
}

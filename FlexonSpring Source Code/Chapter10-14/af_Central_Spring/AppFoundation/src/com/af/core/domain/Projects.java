package com.af.core.domain;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="AFCM_PROJECTS")

public class Projects implements java.io.Serializable
{
	static final long serialVersionUID = 13L;
	
	@Id
	@Column(name="OBJECTIDENTIFIER")
    private long objectIdentifier;
	
	@Column(name="ASSOCOBJECTID")
	private long assocobjectID;
    
	@Column(name="PROJECTNAME")
	private String projectName;
    
	@Column(name="STARTDATE")
	private Date startDate;
    
	@Column(name="ENDDATE")
	private Date endDate;

	@Column(name="PROJECTSPACE")
	private String projectSpace;
	
	@Column(name="PROJECTNOTES")
	private String projectNotes;
	
	@Column(name="PROJECTSCOPE")
	private String projectScope;
	
	@Column(name="PROJECTBUSINESSNEED")
	private String projectBusinessNeed;
	
	@Column(name="PROJECTPROCESSFLOW")
	private String projectProcessFlow;
	
    public Projects() {}

	public long getObjectIdentifier() {
		return objectIdentifier;
	}

	public void setObjectIdentifier(long objectIdentifier) {
		this.objectIdentifier = objectIdentifier;
	}

	public long getAssocobjectID() {
		return assocobjectID;
	}

	public void setAssocobjectID(long assocobjectID) {
		this.assocobjectID = assocobjectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getProjectSpace() {
		return projectSpace;
	}

	public void setProjectSpace(String projectSpace) {
		this.projectSpace = projectSpace;
	}

	public String getProjectNotes() {
		return projectNotes;
	}

	public void setProjectNotes(String projectNotes) {
		this.projectNotes = projectNotes;
	}

	public String getProjectScope() {
		return projectScope;
	}

	public void setProjectScope(String projectScope) {
		this.projectScope = projectScope;
	}

	public String getProjectBusinessNeed() {
		return projectBusinessNeed;
	}

	public void setProjectBusinessNeed(String projectBusinessNeed) {
		this.projectBusinessNeed = projectBusinessNeed;
	}

	public String getProjectProcessFlow() {
		return projectProcessFlow;
	}

	public void setProjectProcessFlow(String projectProcessFlow) {
		this.projectProcessFlow = projectProcessFlow;
	}
}

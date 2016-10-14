package com.af.core.domain;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="AFCM_PROJECTRISKS")

public class ProjectRisks implements java.io.Serializable
{
	static final long serialVersionUID = 12L;
	
	@Id
	@Column(name="OBJECTIDENTIFIER")
    private long objectIdentifier;
	
	@Column(name="ASSOCOBJECTID")
	private long assocobjectID;
    
	@Column(name="RISK")
	private String risk;
    
	@Column(name="OPENDATE")
	private Date openDate;
    
	@Column(name="CLOSEDATE")
	private Date closeDate;
	
	@Column(name="RISKSTATUS")
	private String riskStatus;
	
	@Column(name="RISKDESCRIPTION")
	private String riskDescription;
	
    public ProjectRisks() {}

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

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getRiskStatus() {
		return riskStatus;
	}

	public void setRiskStatus(String riskStatus) {
		this.riskStatus = riskStatus;
	}

	public String getRiskDescription() {
		return riskDescription;
	}

	public void setRiskDescription(String riskDescription) {
		this.riskDescription = riskDescription;
	}
}

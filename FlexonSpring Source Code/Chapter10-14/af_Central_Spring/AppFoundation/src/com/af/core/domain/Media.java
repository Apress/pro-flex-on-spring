package com.af.core.domain;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="AFCM_MEDIA")

public class Media implements java.io.Serializable
{
	static final long serialVersionUID = 9L;
	
	@Id
	@Column(name="OBJECTIDENTIFIER")
    private long objectIdentifier;
	
	@Column(name="ASSOCOBJECTID")
	private long assocobjectID;
    
	@Column(name="CREATIONDATE")
	private Date creationDate;
    
	@Column(name="MEDIANAME")
	private String mediaName;
    
	@Column(name="MEDIADESCRIPTION")
	private String mediaDescription;
	
    public Media() {}

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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public String getMediaDescription() {
		return mediaDescription;
	}

	public void setMediaDescription(String mediaDescription) {
		this.mediaDescription = mediaDescription;
	}
}

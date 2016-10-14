package com.af.core.domain;

import javax.persistence.*;

@Entity
@Table(name="AFCM_CLIENTLINKS")

public class ClientLinks implements java.io.Serializable
{
	static final long serialVersionUID = 4L; 
	
	@Id
	@Column(name="OBJECTIDENTIFIER")
    private long objectIdentifier;
	
	@Column(name="ASSOCOBJECTID")
	private long assocobjectID;
    
	@Column(name="LINKNAME")
	private String linkName;
    
	@Column(name="URL")
	private String url;

    public ClientLinks() {}

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

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

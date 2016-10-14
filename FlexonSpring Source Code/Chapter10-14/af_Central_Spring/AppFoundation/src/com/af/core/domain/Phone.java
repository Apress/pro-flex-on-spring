package com.af.core.domain;

import javax.persistence.*;

@Entity
@Table(name="AFCM_PHONE")

public class Phone implements java.io.Serializable
{
	static final long serialVersionUID = 11L;
	
	@Id
	@Column(name="OBJECTIDENTIFIER")
    private long objectIdentifier;
	
	@Column(name="ASSOCOBJECTID")
	private long assocobjectID;
    
	@Column(name="PHONENUMBER")
	private String phoneNumber;
    
	@Column(name="TYPE")
	private String type;
	
    public Phone() {}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

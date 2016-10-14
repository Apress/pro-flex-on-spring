package com.af.springsecurity.domain;

import java.io.Serializable;

public class UserProfile implements Serializable {
    int objectIdentifier;
    private String username;
    String userFirstName;
    String userMiddleName;
    String userLastName;
    String creationDate;
    String lastUpdateDate;
    private String[] groups;
    
    public UserProfile(String[] groups, String username) {
        this.groups = groups;
        this.username = username;
    }
    
	public int getObjectIdentifier() {
		return objectIdentifier;
	}
	public void setObjectIdentifier(int objectIdentifier) {
		this.objectIdentifier = objectIdentifier;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String[] getGroups() {
		return groups;
	}
	public void setGroups(String[] groups) {
		this.groups = groups;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getUserMiddleName() {
		return userMiddleName;
	}
	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}
}
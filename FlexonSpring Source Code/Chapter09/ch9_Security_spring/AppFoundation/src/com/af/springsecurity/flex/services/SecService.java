package com.af.springsecurity.flex.services;

import com.af.springsecurity.flex.domain.UserProfile;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface SecService 
{
	public UserProfile authenticateUser(String username, String password);
	
	@Transactional(readOnly=true)
	List<UserProfile> getUsers();
	
	@Transactional(readOnly=false)
	void insertUser(UserProfile user);
	
	@Transactional(readOnly=false)
	void deleteUser(UserProfile user);
	
	@Transactional(readOnly=false)
	void updateUser(UserProfile user);
}
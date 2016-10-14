package com.af.springsecurity.services;

import com.af.springsecurity.domain.UserProfile;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface SecService 
{
	UserProfile authenticateUser(String username, String password);
	
	List<UserProfile> getUsers();
	
	@Transactional(readOnly=false)
	void insertUser(UserProfile user);
	
	@Transactional(readOnly=false)
	void deleteUser(UserProfile user);
	
	@Transactional(readOnly=false)
	void updateUser(UserProfile user);
}
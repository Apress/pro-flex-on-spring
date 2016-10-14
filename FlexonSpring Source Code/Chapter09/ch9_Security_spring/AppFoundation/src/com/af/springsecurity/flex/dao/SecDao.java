package com.af.springsecurity.flex.dao;

import java.util.List;

import org.springframework.security.annotation.Secured;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.springsecurity.flex.domain.UserProfile;

public interface SecDao 
{
	
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<UserProfile> getUsers();
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	UserProfile insertUser(UserProfile user);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteUser(UserProfile user);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	@Secured( { "ROLE_ADMIN" })
	void updateUser(UserProfile user);
}
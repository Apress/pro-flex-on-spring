package com.af.springsecurity.dao;

import java.util.List;

import org.springframework.security.annotation.Secured;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.springsecurity.domain.UserProfile;

public interface SecDao 
{
	List<UserProfile> getUsers();
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	@Secured( { "ROLE_ADMIN" })
	UserProfile insertUser(UserProfile user);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	@Secured( { "ROLE_ADMIN" })
	void deleteUser(UserProfile user);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	@Secured( { "ROLE_ADMIN" })
	void updateUser(UserProfile user);
}
package com.af.springsecurity.flex.services;

import com.af.springsecurity.flex.domain.UserProfile;

public interface SecAuthService 
{
	public UserProfile authenticateUser(String username, String password);
}
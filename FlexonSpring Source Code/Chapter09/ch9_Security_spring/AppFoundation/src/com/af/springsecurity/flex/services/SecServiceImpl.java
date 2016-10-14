package com.af.springsecurity.flex.services;

import com.af.springsecurity.flex.dao.SecDao;
import com.af.springsecurity.flex.domain.UserProfile;

import flex.messaging.FlexContext;

import java.security.Principal;
import java.util.List;
import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.security.Authentication;
import org.springframework.security.AuthenticationManager;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class SecServiceImpl implements Serializable, SecService {
	
	// injected by Spring
	SecDao secDao; 
	
	public SecDao getSecDao() {
		return secDao;
	}
	
	public void setSecDao(SecDao secDao) {
		this.secDao = secDao;
	}

    public boolean principleIsAuthenticated() 
    {
        Principal userPrincipal = FlexContext.getUserPrincipal();
        return userPrincipal != null;
    }
    public UserProfile authenticateUser(String username, String password) 
    {
    	String name;
    	Authentication authentication;
    	ApplicationContext context;
    	AuthenticationManager authManager;
    	UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username,password);
    	GrantedAuthority[] authorities;
    	int authoritiesCount;
    	String[] authorizedGroups;
    	
        context = WebApplicationContextUtils.getWebApplicationContext(FlexContext.getServletConfig().getServletContext());
       
        authManager = (AuthenticationManager)context.getBean("authManager");

        authentication = authManager.authenticate(token);
       
        SecurityContextHolder.getContext().setAuthentication(authentication);

        authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
       
        authoritiesCount = authorities.length;
       
        authorizedGroups = new String[authoritiesCount];

        for (int counter = 0; counter < authoritiesCount ; counter++) 
        {
        	authorizedGroups[counter] = authorities[counter].getAuthority();
        }
        
        name = SecurityContextHolder.getContext().getAuthentication().getName();
       
        return new UserProfile(authorizedGroups,name);
    }
    
	// User Management
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<UserProfile> getUsers() {
		return secDao.getUsers();
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void insertUser(UserProfile user) {	
		secDao.insertUser(user);
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteUser(UserProfile user) {
		secDao.deleteUser(user);
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateUser(UserProfile user)  {
		secDao.updateUser(user);
	}
}
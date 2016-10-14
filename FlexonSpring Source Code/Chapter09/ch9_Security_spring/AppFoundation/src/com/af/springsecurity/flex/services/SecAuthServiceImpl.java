package com.af.springsecurity.flex.services;

import com.af.springsecurity.flex.domain.UserProfile;

import flex.messaging.FlexContext;

import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.security.Authentication;
import org.springframework.security.AuthenticationManager;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SecAuthServiceImpl implements Serializable, SecAuthService 
{	
  /*  public boolean principleIsAuthenticated() 
    {
        Principal userPrincipal = FlexContext.getUserPrincipal();
        return userPrincipal != null;
    }
    */
    public UserProfile authenticateUser(String username, String password) 
    {
    	String name;
    	Authentication authentication;
    	ApplicationContext appContext;
    	AuthenticationManager manager;
    	UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username,password);
    	GrantedAuthority[] authorities;
    	int numAuthorities;
    	String[] authorizedGroups;
    	
        appContext = WebApplicationContextUtils.getWebApplicationContext(FlexContext.getServletConfig().getServletContext());
       
        manager = (AuthenticationManager)appContext.getBean("_authenticationManager");

        authentication = manager.authenticate(token);
       
        SecurityContextHolder.getContext().setAuthentication(authentication);

        authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
       
        numAuthorities = authorities.length;
       
        authorizedGroups = new String[numAuthorities];

        for (int counter = 0; counter < numAuthorities ; counter++) 
        {
        	authorizedGroups[counter] = authorities[counter].getAuthority();
        }
        
        name = SecurityContextHolder.getContext().getAuthentication().getName();
       
        return new UserProfile(authorizedGroups,name);
    }
}
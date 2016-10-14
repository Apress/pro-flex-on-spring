package nl.gridshore.samples.books.security.impl;

import nl.gridshore.samples.books.web.security.vo.AuthorizationData;
import nl.gridshore.samples.books.security.BooksSecurityServices;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.security.AuthenticationManager;
import org.springframework.security.Authentication;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;

public class BooksSecurityServiceImpl implements BooksSecurityServices 
{
	public AuthorizationData obtainGrantedRoles() 
	{
		 GrantedAuthority[] authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		 int numAuthorities = authorities.length;
		 String[] grantedRoles = new String[numAuthorities];
		 for (int counter = 0; counter < numAuthorities ; counter++) 
		 {
			 grantedRoles[counter] = authorities[counter].getAuthority();
		 }
		 String username = SecurityContextHolder.getContext().getAuthentication().getName();
		 return new AuthorizationData(grantedRoles,username);
	}
}
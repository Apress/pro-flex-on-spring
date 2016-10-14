package nl.gridshore.samples.books.web.security;

import flex.messaging.FlexContext;

import java.security.Principal;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.security.AuthenticationManager;
import org.springframework.security.Authentication;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import nl.gridshore.samples.books.web.security.vo.AuthorizationData;

public class AuthenticationHelper {
    /**
     * Checks if the current user is authenticated by evaluating the FlexContext
     * @return Boolean true if the current user is authenticated and false elsewise
     */
    public boolean principleIsAuthenticated() {
        Principal userPrincipal = FlexContext.getUserPrincipal();
        return userPrincipal != null;

    }

    /**
     * Takes the username and password as provided and checks the validaty of the credentials. Spring security is used to
     * check the credentielas and to return the authenticated principal with it's authorized roles. An exception is thrown
     * if the authentication failes.
     * @param username String containing the username of the principal to login
     * @param password String containing the password used to identify the current user
     * @return AuthorizationData object containing the name of the principal and the authorized roles.
     */
    public AuthorizationData authenticatePrincipal(String username, String password) {
        ApplicationContext appContext =
                WebApplicationContextUtils.getWebApplicationContext(FlexContext.getServletConfig().getServletContext());
        AuthenticationManager manager = (AuthenticationManager)appContext.getBean("_authenticationManager");
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(username,password);

        Authentication authentication = manager.authenticate(usernamePasswordAuthenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        GrantedAuthority[] authorities =
                SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        int numAuthorities = authorities.length;
        String[] grantedRoles = new String[numAuthorities];
        for (int counter = 0; counter < numAuthorities ; counter++) {
            grantedRoles[counter] = authorities[counter].getAuthority();
        }
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return new AuthorizationData(grantedRoles,name);
    }
}

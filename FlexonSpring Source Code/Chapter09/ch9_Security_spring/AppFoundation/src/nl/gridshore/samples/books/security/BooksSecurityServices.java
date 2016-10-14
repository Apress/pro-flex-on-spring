package nl.gridshore.samples.books.security;


import java.util.List;
import nl.gridshore.samples.books.web.security.vo.AuthorizationData;

public interface BooksSecurityServices {

	public AuthorizationData obtainGrantedRoles();
}

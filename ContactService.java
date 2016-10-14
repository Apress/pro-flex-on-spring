package com.appfoundation.vms.services;

import com.appfoundation.vms.domain.Contact;
import java.util.List;

public interface ContactService {
	
	public abstract List getContacts() throws Exception;
	
	public abstract int insertContact(Contact contact) throws Exception;

	public abstract int updateContact(Contact contact) throws Exception;
	
	public abstract int deleteContact(int contactKey) throws Exception;
}
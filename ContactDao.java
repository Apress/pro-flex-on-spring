package com.appfoundation.vms.dao;

import com.appfoundation.vms.domain.Contact;
import java.util.List;

public interface ContactDao {
	
	public List getContacts();
	
    public int updateContact(Contact contact);

    public int deleteContact(int contactKey);

    public int insertContact(Contact contact);
}

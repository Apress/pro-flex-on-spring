package com.appfoundation.vms.services;

import com.appfoundation.vms.domain.*;
import com.appfoundation.vms.dao.ContactDao;
import java.util.List;
import java.io.Serializable;

public class ContactServiceImpl implements Serializable, ContactService {
	
	// injected by Spring
	ContactDao contactDao; 
	
	public ContactDao getContactDao() {
		return contactDao;
	}
	
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	public List getContacts() throws Exception {
		return contactDao.getContacts();
	}
	
	public int insertContact(Contact contact) throws Exception{	
		return ((Integer)contactDao.insertContact(contact));
	}
 
	public int deleteContact(int contactKey) throws Exception {
       return ((Integer)contactDao.deleteContact(contactKey));
	}
 
	public int updateContact(Contact contact) throws Exception {
       return ((Integer)contactDao.updateContact(contact));
	}
}
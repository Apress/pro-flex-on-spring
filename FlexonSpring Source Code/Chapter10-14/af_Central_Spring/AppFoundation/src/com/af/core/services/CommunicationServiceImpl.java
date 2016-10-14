package com.af.core.services;

import com.af.core.dao.CommunicationDao;
import com.af.core.domain.Address;
import com.af.core.domain.Phone;

import java.util.List;
import java.io.Serializable;

public class CommunicationServiceImpl implements Serializable, CommunicationService 
{
	// injected by Spring
	CommunicationDao communicationDao; 
	
	public CommunicationDao getCommunicationDao() {
		return communicationDao;
	}
	
	public void setCommunicationDao(CommunicationDao communicationDao) {
		this.communicationDao = communicationDao;
	}

	// Address
	public List<Address> getAddresses() {
		return communicationDao.getAddresses();
	}
	public void insertAddress(Address address) {	
		communicationDao.insertAddress(address);
	}
	public void deleteAddress(Address address) {
		communicationDao.deleteAddress(address);
	}
	public void updateAddress(Address address)  {
		communicationDao.updateAddress(address);
	}
	
	// Phone
	public List<Phone> getPhoneNumbers() {
		return communicationDao.getPhoneNumbers();
	}
	public void insertPhone(Phone phone) {	
		communicationDao.insertPhone(phone);
	}
	public void deletePhone(Phone phone) {
		communicationDao.deletePhone(phone);
	}
	public void updatePhone(Phone phone)  {
		communicationDao.updatePhone(phone);
	}
}
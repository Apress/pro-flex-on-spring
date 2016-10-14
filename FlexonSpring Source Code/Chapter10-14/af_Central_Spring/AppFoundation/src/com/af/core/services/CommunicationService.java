package com.af.core.services;

import com.af.core.domain.Address;
import com.af.core.domain.Phone;

import java.util.List;

public interface CommunicationService 
{
	// Address
	List<Address> getAddresses();
	
	void insertAddress(Address address);
	
	void deleteAddress(Address address);
	
	void updateAddress(Address address);
	
	// Phone
	List<Phone> getPhoneNumbers();
	
	void insertPhone(Phone phone);
	
	void deletePhone(Phone phone);
	
	void updatePhone(Phone phone);
}
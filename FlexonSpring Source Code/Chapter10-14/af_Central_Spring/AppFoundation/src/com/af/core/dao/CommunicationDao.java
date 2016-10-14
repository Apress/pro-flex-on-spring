package com.af.core.dao;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.af.core.domain.Phone;
import com.af.core.domain.Address;

public interface CommunicationDao {
	
	// Address
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<Address> getAddresses();
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	Address insertAddress(Address address);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteAddress(Address address);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateAddress(Address address);
	
	// Phone
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<Phone> getPhoneNumbers();
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	Phone insertPhone(Phone phone);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deletePhone(Phone phone);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updatePhone(Phone phone);
}

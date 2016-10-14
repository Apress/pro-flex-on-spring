package com.af.core.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.common.util.AFObjID;
import com.af.core.dao.CommunicationDao;
import com.af.core.domain.Address;
import com.af.core.domain.Phone;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class CommunicationDaoImpl extends HibernateDaoSupport implements CommunicationDao 
{   
	AFObjID aSingleton = AFObjID.getInstance();
	
	// Address
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Address> getAddresses(){
		return getHibernateTemplate().find("from Address");
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public Address insertAddress(Address address){
		address.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (Address) getHibernateTemplate().merge(address);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteAddress(Address address){
		getHibernateTemplate().delete(address);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateAddress(Address address){
		getHibernateTemplate().delete(address);
	}
	
	// Phone
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Phone> getPhoneNumbers(){
		return getHibernateTemplate().find("from Phone");
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public Phone insertPhone(Phone phone){
		phone.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (Phone) getHibernateTemplate().merge(phone);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deletePhone(Phone phone){
		getHibernateTemplate().delete(phone);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updatePhone(Phone phone){
		getHibernateTemplate().delete(phone);
	}
}

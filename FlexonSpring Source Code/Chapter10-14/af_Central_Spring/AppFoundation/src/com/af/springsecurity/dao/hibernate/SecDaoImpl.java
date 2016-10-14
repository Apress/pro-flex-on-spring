package com.af.springsecurity.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.springsecurity.dao.SecDao;
import com.af.springsecurity.domain.UserProfile;

public class SecDaoImpl extends HibernateDaoSupport implements SecDao 
{   
	public List<UserProfile> getUsers(){
		return getHibernateTemplate().find("from Users");
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public UserProfile insertUser(UserProfile user){
		return (UserProfile) getHibernateTemplate().merge(user);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteUser(UserProfile user){
		getHibernateTemplate().delete(user);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateUser(UserProfile user){
		getHibernateTemplate().delete(user);
	}
}

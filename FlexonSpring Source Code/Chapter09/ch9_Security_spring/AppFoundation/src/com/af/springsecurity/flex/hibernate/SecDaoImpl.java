package com.af.springsecurity.flex.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.springsecurity.flex.dao.SecDao;
import com.af.springsecurity.flex.domain.UserProfile;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class SecDaoImpl extends HibernateDaoSupport implements SecDao 
{   
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
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

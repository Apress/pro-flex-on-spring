package com.appfoundation.vms.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.dao.DataAccessException;

import com.appfoundation.vms.domain.Contact;
import com.appfoundation.vms.dao.ContactDao;

public class ContactDaoImpl implements ContactDao {


	public List getContacts() throws DataAccessException {
		return sqlMapClientTemplate.queryForList("getContacts");
	}
	
    public int insertContact(Contact contact) throws DataAccessException {      
    	return ((Integer)sqlMapClientTemplate.insert("insertContact", contact)).intValue();
    }
    
    public int updateContact(Contact contact) throws DataAccessException {
        return ((Integer)sqlMapClientTemplate.update("updateContact", contact)).intValue();
    }
    
    public int deleteContact(int contactKey) throws DataAccessException {
        return ((Integer)sqlMapClientTemplate.delete("deleteContact", contactKey)).intValue();
    }

    private SqlMapClientTemplate sqlMapClientTemplate;
    
    public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate) {
    	this.sqlMapClientTemplate = sqlMapClientTemplate;
    }
}

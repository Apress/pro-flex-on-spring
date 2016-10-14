package com.af.core.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.af.common.util.AFObjID;
import com.af.core.dao.ClientDao;
import com.af.core.domain.Client;
import com.af.core.domain.ClientContacts;
import com.af.core.domain.ClientLinks;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class ClientDaoImpl extends HibernateDaoSupport implements ClientDao 
{   
	AFObjID aSingleton = AFObjID.getInstance();
	
	// Clients
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Client> getClients(){
		return getHibernateTemplate().find("from Client");
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public Client insertClient(Client client){
		client.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (Client) getHibernateTemplate().merge(client);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteClient(Client client){
		getHibernateTemplate().delete(client);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateClient(Client client){
		getHibernateTemplate().merge(client);
	}
	
	// ClientContacts
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<ClientContacts> getClientContacts(long key){
		return getHibernateTemplate().find("from ClientContacts where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public ClientContacts insertClientContact(ClientContacts clientContact){
		clientContact.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (ClientContacts) getHibernateTemplate().merge(clientContact);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteClientContact(ClientContacts clientContact){
		getHibernateTemplate().delete(clientContact);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateClientContact(ClientContacts clientContact){
		getHibernateTemplate().merge(clientContact);
	}
	
	// ClientLinks
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<ClientLinks> getClientLinks(long key){
		return getHibernateTemplate().find("from ClientLinks where assocobjectid=?", key);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public ClientLinks insertClientLink(ClientLinks clientLinks){
		clientLinks.setObjectIdentifier(aSingleton.NewObjectIdentifier());
		return (ClientLinks) getHibernateTemplate().merge(clientLinks);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteClientLink(ClientLinks clientLinks){
		getHibernateTemplate().delete(clientLinks);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void updateClientLink(ClientLinks clientLinks){
		getHibernateTemplate().merge(clientLinks);
	}
}

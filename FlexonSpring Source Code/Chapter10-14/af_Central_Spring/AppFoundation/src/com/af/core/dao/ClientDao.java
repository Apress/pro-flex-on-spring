package com.af.core.dao;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.af.core.domain.Client;
import com.af.core.domain.ClientContacts;
import com.af.core.domain.ClientLinks;

public interface ClientDao {
	
	//Clients
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<Client> getClients();
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	Client insertClient(Client client);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteClient(Client client);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateClient(Client client);
	
	//ClientContacts
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<ClientContacts> getClientContacts(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	ClientContacts insertClientContact(ClientContacts clientContacts);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteClientContact(ClientContacts clientContacts);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateClientContact(ClientContacts clientContacts);
	
	//Clientlinks
	@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
	List<ClientLinks> getClientLinks(long key);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	ClientLinks insertClientLink(ClientLinks clientLinks);

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	void deleteClientLink(ClientLinks clientLinks);
		
	@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
	void updateClientLink(ClientLinks clientLinks);
}

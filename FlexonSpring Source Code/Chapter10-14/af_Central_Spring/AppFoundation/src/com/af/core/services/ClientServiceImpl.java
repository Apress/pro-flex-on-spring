package com.af.core.services;

import com.af.core.dao.ClientDao;
import com.af.core.domain.Client;
import com.af.core.domain.ClientContacts;
import com.af.core.domain.ClientLinks;

import java.util.List;
import java.io.Serializable;

public class ClientServiceImpl implements Serializable, ClientService {
	
	// injected by Spring
	ClientDao clientDao; 
	
	public ClientDao getClientDao() {
		return clientDao;
	}
	
	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	// Clients
	public List<Client> getClients() {
		return clientDao.getClients();
	}
	public Client insertClient(Client client) {	
		return clientDao.insertClient(client);
	}
	public void deleteClient(Client client) {
		clientDao.deleteClient(client);
	}
	public void updateClient(Client client)  {
		clientDao.updateClient(client);
	}
	
	// ClientContacts
	public List<ClientContacts> getClientContacts(long key) {
		return clientDao.getClientContacts(key);
	}
	public ClientContacts insertClientContact(ClientContacts clientContact) {	
		return clientDao.insertClientContact(clientContact);
	}
	public void deleteClientContact(ClientContacts clientContact) {
		clientDao.deleteClientContact(clientContact);
	}
	public void updateClientContact(ClientContacts clientContact)  {
		clientDao.updateClientContact(clientContact);
	}
	
	// ClientLinks
	public List<ClientLinks> getClientLinks(long key) {
		return clientDao.getClientLinks(key);
	}
	public ClientLinks insertClientLink(ClientLinks clientLinks) {	
		return clientDao.insertClientLink(clientLinks);
	}
	public void deleteClientLink(ClientLinks clientLinks) {
		clientDao.deleteClientLink(clientLinks);
	}
	public void updateClientLink(ClientLinks clientLinks)  {
		clientDao.updateClientLink(clientLinks);
	}
}
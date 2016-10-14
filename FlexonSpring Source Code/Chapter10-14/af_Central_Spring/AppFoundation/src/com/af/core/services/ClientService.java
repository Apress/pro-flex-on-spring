package com.af.core.services;

import com.af.core.domain.Client;
import com.af.core.domain.ClientContacts;
import com.af.core.domain.ClientLinks;

import java.util.List;

public interface ClientService 
{
	// Clients
	List<Client> getClients();
	
	Client insertClient(Client client);
	
	void deleteClient(Client client);
	
	void updateClient(Client client);
	
	// Client Contacts
	List<ClientContacts> getClientContacts(long key);
	
	ClientContacts insertClientContact(ClientContacts clientContact);
	
	void deleteClientContact(ClientContacts clientContact);
	
	void updateClientContact(ClientContacts clientContact);
	
	// Client Links
	List<ClientLinks> getClientLinks(long key);
	
	ClientLinks insertClientLink(ClientLinks clientLink);
	
	void deleteClientLink(ClientLinks clientLink);
	
	void updateClientLink(ClientLinks clientLink);
}
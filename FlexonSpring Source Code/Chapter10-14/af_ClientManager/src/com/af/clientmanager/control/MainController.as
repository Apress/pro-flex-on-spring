package com.af.clientmanager.control
{
	import com.adobe.cairngorm.control.FrontController;
	import com.af.clientmanager.control.commands.AuthenticateUserCommand;
	import com.af.clientmanager.control.commands.clientCommands.*;
	import com.af.clientmanager.control.commands.events.AuthenticateUserEvent;
	import com.af.clientmanager.control.commands.events.clientEvents.*;

	public class MainController extends FrontController
	{		
		public function MainController():void
		{
			// Clients
		    addCommand(GetClientsEvent.EVENT_GET_CLIENTS, GetClientsCommand );
		    addCommand(InsertClientEvent.EVENT_INSERT_CLIENT, InsertClientCommand );
		    addCommand(DeleteClientEvent.EVENT_DELETE_CLIENT, DeleteClientCommand );
		    addCommand(UpdateClientEvent.EVENT_UPDATE_CLIENT, UpdateClientCommand );
		    // Client Contacts
		    addCommand(GetClientContactsEvent.EVENT_GET_CLIENT_CONTACTS, GetClientContactsCommand );
		    addCommand(InsertClientContactEvent.EVENT_INSERT_CLIENT_CONTACT, InsertClientContactCommand );
		    addCommand(DeleteClientContactEvent.EVENT_DELETE_CLIENT_CONTACT, DeleteClientContactCommand );
		    addCommand(UpdateClientContactEvent.EVENT_UPDATE_CLIENT_CONTACT, UpdateClientContactCommand );
		    // Client Links
		    addCommand(GetClientLinksEvent.EVENT_GET_CLIENT_LINKS, GetClientLinksCommand );
		    addCommand(InsertClientLinkEvent.EVENT_INSERT_CLIENT_LINK, InsertClientLinkCommand );
		    addCommand(DeleteClientLinkEvent.EVENT_DELETE_CLIENT_LINK, DeleteClientLinkCommand );
		    addCommand(UpdateClientLinkEvent.EVENT_UPDATE_CLIENT_LINK, UpdateClientLinkCommand );
		    // Security
		    addCommand(AuthenticateUserEvent.EVENT_AUTHENTICATE_USER, AuthenticateUserCommand);
		    // Invoices + Invoice Details
		    
		    // Issues
		    
		    // Media
		    
		    //Projects + Project Risks + Project Tasks
		    
		    
		}
	}
}
package com.af.cep.control
{
	import com.adobe.cairngorm.control.FrontController;
	import com.af.cep.commands.*;
	import com.af.cep.commands.events.AddContactEvent;
	import com.af.cep.commands.events.DeleteContactEvent;
	import com.af.cep.commands.events.GetContactsEvent;
	import com.af.cep.commands.events.UpdateContactEvent;
	
	public class ContactController extends FrontController
	{
		public function ContactController()
		{
			addCommand( AddContactEvent.EVENT_ADD_CONTACT, AddContactCommand );
			addCommand( GetContactsEvent.EVENT_GET_CONTACTS, GetContactsCommand );
			addCommand( UpdateContactEvent.EVENT_UPDATE_CONTACT, UpdateContactCommand );
			addCommand( DeleteContactEvent.EVENT_DELETE_CONTACT, DeleteContactCommand );
		}	
	}
}
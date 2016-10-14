package com.af.cep.controller
{
	import com.af.cep.model.ContactProxy;
	import com.af.cep.view.ContactsMediator;
	
	import org.puremvc.as3.interfaces.INotification;
	import org.puremvc.as3.patterns.command.SimpleCommand;

	public class UpdateContactCommand extends SimpleCommand
	{
		override public function execute(notification:INotification):void
		{
			var noteBody:Object = notification.getBody();
			var contactProxy:ContactProxy = ContactProxy(facade.retrieveProxy(ContactProxy.NAME));
			var contactsMediator:ContactsMediator = ContactsMediator(facade.retrieveMediator(ContactsMediator.NAME));

			contactProxy.contact.name = noteBody.name;
			contactProxy.contact.email = noteBody.email;
			contactProxy.updateContact();
			
			contactsMediator.clearFormItems();									
		}		
	}
}
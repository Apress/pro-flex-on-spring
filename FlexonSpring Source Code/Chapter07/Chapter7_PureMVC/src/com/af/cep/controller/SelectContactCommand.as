package com.af.cep.controller
{
	import com.af.cep.model.ContactProxy;
	import com.af.cep.model.vo.ContactVO;
	
	import org.puremvc.as3.interfaces.INotification;
	import org.puremvc.as3.patterns.command.SimpleCommand;

	public class SelectContactCommand extends SimpleCommand
	{
		override public function execute(notification:INotification):void
		{
			var noteBody:Object = notification.getBody();
			var contactProxy:ContactProxy = ContactProxy(facade.retrieveProxy(ContactProxy.NAME));
			
			contactProxy.contact = new ContactVO();
			contactProxy.contact.contact_id = noteBody.contact_id;
			contactProxy.contact.name = noteBody.name;
			contactProxy.contact.email = noteBody.email;			
		}		
	}
}
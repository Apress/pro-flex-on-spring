package com.af.cep.controller
{
	import com.af.cep.model.ContactProxy;
	
	import org.puremvc.as3.interfaces.INotification;
	import org.puremvc.as3.patterns.command.SimpleCommand;

	public class DeleteContactCommand extends SimpleCommand
	{
		override public function execute(notification:INotification):void
		{
			var contactProxy:ContactProxy = ContactProxy(facade.retrieveProxy(ContactProxy.NAME));

			contactProxy.deleteContact();
		}		
	}
}
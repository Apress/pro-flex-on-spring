package com.af.cep.controller
{
      import com.af.cep.*;
      import com.af.cep.model.*;
      import com.af.cep.view.ApplicationMediator;
    
      import org.puremvc.as3.interfaces.*;
      import org.puremvc.as3.patterns.command.*;
      import org.puremvc.as3.patterns.observer.*;
    
      public class ViewInitCommand extends SimpleCommand
      {
            override public function execute( notification:INotification ) :void    
            {
                  facade.registerMediator( new ApplicationMediator( notification.getBody() ) );            
            
                  var contactProxy:ContactProxy = facade.retrieveProxy( ContactProxy.NAME ) as ContactProxy;
                  contactProxy.getContacts();

                  sendNotification( ApplicationFacade.GET_CONTACTS );
               }
      }
}

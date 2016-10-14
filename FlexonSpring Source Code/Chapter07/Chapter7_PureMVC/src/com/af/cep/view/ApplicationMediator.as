package com.af.cep.view
{
      import com.af.cep.ApplicationFacade;
      import com.af.cep.model.*;
      import com.af.cep.model.vo.ContactVO;
      import com.af.cep.view.viewcomponents.*;
    
      import org.puremvc.as3.interfaces.*;
      import org.puremvc.as3.patterns.mediator.Mediator;
    
      public class ApplicationMediator extends Mediator implements IMediator
      {
            public static const NAME:String = "ApplicationMediator";
        
             public function ApplicationMediator( viewComponent:Object ) 
             {
                   super( NAME, viewComponent );
                  
                  facade.registerMediator( new ContactsMediator( app.contactPanel ) );
            
                  contactProxy = ContactProxy( facade.retrieveProxy( ContactProxy.NAME ) );
             }
             override public function listNotificationInterests():Array 
             {
                  return [ ApplicationFacade.GET_CONTACTS];
             }
             override public function handleNotification( notification:INotification ):void 
             {
                  switch ( notification.getName() ) 
                  {
                        case ApplicationFacade.GET_CONTACTS:
                              contactProxy.contact = null;
                              break;
                  }
             }
             protected function get app():PureMVCExample
            {
                  return viewComponent as PureMVCExample;
            }
            
            private var contactProxy:ContactProxy;
    }
}

package com.af.cep.view
{
      import com.af.cep.ApplicationFacade;
      import com.af.cep.model.ContactProxy;
      import com.af.cep.model.vo.ContactVO;
      import com.af.cep.view.viewcomponents.ContactPanel;

      import flash.events.Event;

      import org.puremvc.as3.interfaces.*;
      import org.puremvc.as3.patterns.mediator.Mediator;
    
      public class ContactsMediator extends Mediator implements IMediator
      {
            public static const NAME:String = "ContactsMediator";
        
            public function ContactsMediator( viewComponent:Object ) 
            {
                  super( NAME, viewComponent );

                  contactProxy = ContactProxy( facade.retrieveProxy( ContactProxy.NAME ) );

                  contactPanel.addEventListener( ContactPanel.GET_CONTACTS, getContacts );
                  contactPanel.addEventListener( ContactPanel.ADD_CONTACT, addContact );
                  contactPanel.addEventListener( ContactPanel.UPDATE_CONTACT, updateContact );
                  contactPanel.addEventListener( ContactPanel.DELETE_CONTACT, deleteContact );
                  contactPanel.addEventListener( ContactPanel.SELECTED_CONTACT, setSelectedContact );
             }
             override public function listNotificationInterests():Array 
             {
                   return [ ApplicationFacade.LOAD_CONTACTS_SUCCESS,
                               ApplicationFacade.LOAD_CONTACTS_FAILED
                               ];
             }
             override public function handleNotification( notification:INotification ):void 
             {
                   var selectedItem:Object = new Object();

                   switch ( notification.getName() )
                  {
                        case ApplicationFacade.LOAD_CONTACTS_SUCCESS:
                              contactPanel.dgContact.dataProvider = contactProxy.contactListDP;
                              break;
                        case ApplicationFacade.LOAD_CONTACTS_FAILED:
                              break;
                   }
            }
            
            public function clearFormItems():void
            {
				contactPanel.clearFormItems();            	
            }
            
            protected function get contactPanel():ContactPanel
            {
                  return viewComponent as ContactPanel;
             }
            private function getContacts( event:Event = null ):void
            {
                  sendNotification( ApplicationFacade.GET_CONTACTS );
            }
            private function addContact( event:Event = null ):void
            {
                  sendNotification( ApplicationFacade.ADD_CONTACT, {name:contactPanel.fullName.text, email:contactPanel.emailAddress.text} );
                  contactPanel.clearFormItems();
            }
            private function setSelectedContact( event:Event = null ):void
            {
                  sendNotification(ApplicationFacade.SELECTED_CONTACT, contactPanel.dgContact.selectedItem);
            }
            private function deleteContact( event:Event = null ):void
            {
                  sendNotification( ApplicationFacade.DELETE_CONTACT );
                  contactPanel.clearFormItems();
            }
            private function updateContact( event:Event = null ):void
            {
                  sendNotification( ApplicationFacade.UPDATE_CONTACT,{name:contactPanel.fullName.text, email:contactPanel.emailAddress.text} );
            }

            private var contactProxy:ContactProxy;
      }
}

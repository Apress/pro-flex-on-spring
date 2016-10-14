package com.af.cep
{
      import com.af.cep.controller.*;
      import com.af.cep.model.*;
      import com.af.cep.view.*;
      
      import org.puremvc.as3.interfaces.*;
      import org.puremvc.as3.patterns.facade.*;
      import org.puremvc.as3.patterns.proxy.*;

      public class ApplicationFacade extends Facade
      {
            public static const STARTUP:String = "startup";
            public static const SHUTDOWN:String = "shutdown";

            public static const LOAD_CONTACTS_SUCCESS:String = "loadContactsSuccess";
            public static const LOAD_CONTACTS_FAILED:String = "loadContactsFailed";

            public static const GET_CONTACTS:String = "getContacts";
            public static const ADD_CONTACT:String = "addContact";
            public static const UPDATE_CONTACT:String = "updateContact";
            public static const DELETE_CONTACT:String = "deleteContact";
            public static const SELECTED_CONTACT:String = "selectedContact";
       
            public static function getInstance() : ApplicationFacade 
            {
                  if ( instance == null ) instance = new ApplicationFacade( );
                        return instance as ApplicationFacade;
            }
            override protected function initializeController( ) : void 
            {
                  super.initializeController(); 
                  registerCommand(STARTUP, ApplicationStartupCommand );
                  registerCommand(SELECTED_CONTACT, SelectContactCommand);
                  registerCommand(ADD_CONTACT, AddContactCommand);
                  registerCommand(UPDATE_CONTACT, UpdateContactCommand);
                  registerCommand(DELETE_CONTACT, DeleteContactCommand);
            }
            public function startup( app:PureMVCExample ):void
            {
                  sendNotification( STARTUP, app );
            }
      }
}

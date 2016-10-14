package com.af.cep.model
{
      import com.af.cep.*;
      import com.af.cep.model.business.ContactDelegate;
      import com.af.cep.model.vo.ContactVO;

      import mx.collections.ArrayCollection;
      import mx.rpc.IResponder;

      import org.puremvc.as3.interfaces.*;
      import org.puremvc.as3.patterns.proxy.Proxy;

      public class ContactProxy extends Proxy implements IProxy, IResponder
      {
            public static const NAME:String = "ContactProxy";

            public function ContactProxy ( data:Object = null ) 
            {
                  super ( NAME, data );
            }
            public function getContacts():void
            {
                  var delegate : ContactDelegate = new ContactDelegate( this );
                  delegate.getContactsService();
            }
            public function result( rpcEvent : Object ) : void
            {
                  data = rpcEvent.result.contacts.contact as ArrayCollection;
                  sendNotification( ApplicationFacade.LOAD_CONTACTS_SUCCESS );
            }
            public function fault( rpcEvent : Object ) : void 
            {
                  data = new ArrayCollection();
                  errorStatus = "Could Not Load Contact List!";
                  sendNotification( ApplicationFacade.LOAD_CONTACTS_FAILED );
            }
            public function addContact():void
            {
                  if( contact != null )
                  {
                        contactListDP.addItem( contact );
                  }
            }
            public function updateContact():void
            {
                  var dpIndex : int = -1;

                  if( contact != null )
                  {
                        for ( var i:int = 0; i < contactListDP.length; i++ ) 
                        {
                              if ( contactListDP[i].contact_id == contact.contact_id ) 
                              {
                                    dpIndex = i;
                              }
                        }
                        contactListDP.setItemAt( contact, dpIndex );
                  }
            }
            public function deleteContact():void
            {
                  if( contact != null )
                  {
                        for ( var i:int=0; i < contactListDP.length; i++ ) 
                        {
                              if ( contact.contact_id == contactListDP[i].contact_id ) 
                              {
                                    contactListDP.removeItemAt(i);
                              }
                        }
                  }
            }
            public function get contactListDP():ArrayCollection
            {
                  return data as ArrayCollection;
            }

            public var contact:ContactVO = new ContactVO();
            public var errorStatus:String;
      }
}

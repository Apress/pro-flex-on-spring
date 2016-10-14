package com.af.cep.model.business
{
      import mx.rpc.AsyncToken;
      import mx.rpc.IResponder;
      import mx.rpc.http.HTTPService;

      public class ContactDelegate 
      {
            private var responder : IResponder;
            private var contactService : HTTPService;

            public function ContactDelegate( responder : IResponder ) 
            {
                  this.contactService = new HTTPService();
                  this.contactService.url="assets/xml/Contacts.xml";

                  this.responder = responder;
            }
            public function getContactsService() : void 
            {
                  var token:AsyncToken = contactService.send();

                  token.addResponder( responder );
            }
      }
}

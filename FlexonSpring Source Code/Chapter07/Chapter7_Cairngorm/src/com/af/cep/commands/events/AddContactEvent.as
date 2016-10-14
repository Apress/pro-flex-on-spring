package com.af.cep.commands.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.cep.vo.ContactVO;
	import com.af.cep.control.ContactController;	

	public class AddContactEvent extends CairngormEvent 
	{
		public static const EVENT_ADD_CONTACT : String = "addContact";
		public var contactVO : ContactVO;
		
		public function AddContactEvent( contactVO : ContactVO ) 
		{
			super( EVENT_ADD_CONTACT );
			this.contactVO = contactVO;
		}
	}	
}
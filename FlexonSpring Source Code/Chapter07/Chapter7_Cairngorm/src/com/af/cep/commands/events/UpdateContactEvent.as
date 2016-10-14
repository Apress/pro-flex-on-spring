package com.af.cep.commands.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.cep.vo.ContactVO;
	import com.af.cep.control.ContactController;	

	public class UpdateContactEvent extends CairngormEvent 
	{
		public static const EVENT_UPDATE_CONTACT : String = "updateContact";
		public var contactVO : ContactVO;
				
		public function UpdateContactEvent( contactVO : ContactVO ) 
		{
			super( EVENT_UPDATE_CONTACT );
			this.contactVO = contactVO;
		}
	}	
}
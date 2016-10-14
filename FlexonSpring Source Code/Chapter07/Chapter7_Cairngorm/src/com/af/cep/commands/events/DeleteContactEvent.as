package com.af.cep.commands.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.cep.vo.ContactVO;
	import com.af.cep.control.ContactController;	

	public class DeleteContactEvent extends CairngormEvent 
	{
		public static const EVENT_DELETE_CONTACT : String = "deleteContact";
		public var contactVO : ContactVO;
				
		public function DeleteContactEvent( contactVO : ContactVO ) 
		{
			super( EVENT_DELETE_CONTACT );
			this.contactVO = contactVO;
		}
	}	
}
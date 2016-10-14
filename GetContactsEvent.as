package com.af.cep.commands.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.af.cep.vo.ContactVO;
	import com.af.cep.control.ContactController;	

	public class GetContactsEvent extends CairngormEvent 
	{				
		public static const EVENT_GET_CONTACTS : String = "getContacts";
		
		public function GetContactsEvent() 
		{
			super( EVENT_GET_CONTACTS );
		}
	}	
}
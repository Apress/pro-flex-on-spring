package com.af.cep.model
{
	import com.af.cep.vo.ContactVO;
	
	public class AddContact
	{
		[Bindable]
		public var contactVO : ContactVO;
		[Bindable]
		public var isPending : Boolean;	
		[Bindable]
		public var statusMessage : String;	
	}
}
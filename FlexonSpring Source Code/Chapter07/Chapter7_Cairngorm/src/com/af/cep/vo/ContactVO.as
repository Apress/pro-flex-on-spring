package com.af.cep.vo
{
	import com.adobe.cairngorm.vo.ValueObject;
	
	[Bindable]
    [RemoteClass(alias="com.af.vms.domain.Contact")]
    
    [Bindable]
	public class ContactVO 
	{
		public var contacts: Array;

	    public var objectIdentifier: Number;
	    public var name: String;
		public var businessPhone: String;
		public var mobilePhone: String;
		public var homePhone: String;
		public var addressLine1: String;
		public var addressLine2: String;
		public var addressLine3: String;
		public var city: String;		
		public var state: String;
		public var zip: String;
		public var email: String;
		public var company: String;
		public var title: String;
		public var responsibility: String;
		public var image: String;
		public var department: String;
		public var phoneExtension: String;
		public var fax: String;
		public var status: String;
		public var refferedBy: String;
		public var country: String;
		public var webSite: String;
	}
}

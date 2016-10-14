package com.af.cep.model
{
 	import com.adobe.cairngorm.model.ModelLocator;
	import mx.collections.ArrayCollection;
	import mx.controls.DataGrid;
	import com.af.cep.vo.ContactVO;

 	[Bindable]
	public class ModelLocator implements com.adobe.cairngorm.model.ModelLocator
	{
		private static var modelLocator : com.af.cep.model.ModelLocator;
		
		public static function getInstance() : com.af.cep.model.ModelLocator 
		{
			if ( modelLocator == null )
				modelLocator = new com.af.cep.model.ModelLocator();
				
			return modelLocator;
	   }
	   
   	public function ModelLocator() 
   	{
   		if ( com.af.cep.model.ModelLocator.modelLocator != null )
				throw new Error( "Only one ModelLocator instance " + 
						"should be instantiated" );	
   	}
		
		public var addcontact : AddContact = new AddContact();
		public var contacts : ArrayCollection = new ArrayCollection();
		public var contactDG : DataGrid = new DataGrid;
		public var contact : ContactVO = new ContactVO;
	}	
}


package com.af.clientmanager.control.commands.events
{
	import com.adobe.cairngorm.control.CairngormEvent;

	public class AuthenticateUserEvent extends CairngormEvent 
	{
		public static const EVENT_AUTHENTICATE_USER:String = "event_authenticate_user";
		public var userName:String;
		public var password:String;

		public function AuthenticateUserEvent( userName:String, password:String ) 
		{
			super( EVENT_AUTHENTICATE_USER );
			this.userName = userName;
			this.password = password;
		}
	}	
}
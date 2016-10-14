package assets
{
	[Bindable]
	public class AssetLib
	{
		public function AssetLib()
		{
		}
        
        [Embed(source="/assets/images/HP_Header.png")]
        public static var headerBG:Class
        
        [Embed(source="/assets/images/LoginScreen.png")]
        public static var loginBG:Class
        
        [Embed(source="/assets/images/background_HP.jpg")]
        public static var appBG:Class
	}
}
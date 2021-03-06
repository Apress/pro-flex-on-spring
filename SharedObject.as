//****************************************************************************
// ActionScript Standard Library
// SharedObject object
//****************************************************************************

intrinsic class SharedObject
{
	static function getLocal(name:String,localPath:String):SharedObject;
	static function getRemote(name:String,remotePath:String,persistence:Boolean):SharedObject;
	static function deleteAll(url:String);
	static function getDiskUsage(url:String);

	function clear():Void;
	function connect(myConnection:NetConnection):Boolean;
	function send(handlerName:String):Void;
	function flush(minDiskSpace:Number):Object; // minDiskSpace optional
	function close():Void;
	function getSize():Number;
	function setFps(updatesPerSecond:Number):Boolean;

	function onStatus(infoObject:Object):Void;
	function onSync(objArray:Array):Void;

	var data:Object;
}



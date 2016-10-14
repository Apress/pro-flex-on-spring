﻿import mx.central.data.SelectedItem;
intrinsic class mx.central.Shell {
	function addNotice (noticeData:Object, initialData:Object):Number;
	function addPod (podData:Object):Number;
	function addToLocalInternetCache (url:String, bOverwrite:Boolean, expiration:Object):Void;
	function editLocationDialog (Void):Void;
	function getAgent (Void):Object;
	function getBounds (Void):Object;
	function getNotices (Void):Array;
	function getPods (Void):Array;
	function getPreferences (Void):Object;
	function getSelectedItem (Void):SelectedItem;
	function getViewedApplications (Void):Array;
	function getViewedPods (Void):Array;
	function inLocalInternetCache (url:String):Boolean;
	function isPurchased (Void):Boolean;
	function isConnected (Void):Boolean;
	function isConsoleOpen (Void):Boolean;
	function newLocationDialog (reqFields:Array):Void;
	function removeFromLocalInternetCache (url:String):Void;
	function removeNotice (noticeID:Number):Boolean;
	function removePod (podID:Number):Void;
	function requestPayment (desctiption:String, price:String, transactionID:Object):Void;
	function requestSizeChange (width:Number, height:Number):Void;
	function setSelectedItem (data:Array, description:String):Void;
	function setProgress (percent:Number):Void;
	function setStatus (message:String):Void;
	function startAgent (Void):Boolean;
	function stopAgent (Void):Boolean;
	function validateActivationKey (activationKey:String, transactionID:Object):Boolean;
	function viewPod (podID:Number):Void;
}
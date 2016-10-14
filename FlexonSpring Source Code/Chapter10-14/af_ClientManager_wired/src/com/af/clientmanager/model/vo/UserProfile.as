package com.af.model.vo {

import mx.collections.ArrayCollection;
	
[Bindable]
[RemoteClass(alias="com.af.springsecurity.domain.UserProfile")]

public class UserProfile 
{
        public var groups:Array;
        public var username:String;
        public var isAdmin:Boolean = false;
        
        public function userIsAdmin():void 
        {
            for (var i:String in groups) 
            {
                if (groups[i] == "ROLE_ADMIN") 
                {
                    isAdmin = true;
                }
            }
        }
        
        public function addUserGroup(group:String):void 
        {
            groups.push(group);
        }
    }
}

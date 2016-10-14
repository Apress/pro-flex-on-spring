package com.af.clientmanager.control
{
	import com.adobe.cairngorm.control.FrontController;
	import com.af.clientmanager.control.commands.*;
	import com.af.clientmanager.control.commands.events.*;

	public class MainController extends FrontController
	{		
		public function MainController():void
		{
		    addCommand(GetClientsEvent.EVENT_GET_CLIENTS, GetClientsCommand );
		    addCommand(InsertClientEvent.EVENT_INSERT_CLIENT, InsertClientCommand );
		    addCommand(DeleteClientEvent.EVENT_DELETE_CLIENT, DeleteClientCommand );
		    addCommand(UpdateClientEvent.EVENT_UPDATE_CLIENT, UpdateClientCommand );
		}
	}
}
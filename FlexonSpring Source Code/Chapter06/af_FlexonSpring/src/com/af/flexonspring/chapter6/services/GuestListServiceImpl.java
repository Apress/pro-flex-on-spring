package com.af.flexonspring.chapter6.services;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import com.af.flexonspring.chapter6.domain.Guest;

public class GuestListServiceImpl implements Serializable, GuestListService 
{
	public List<Guest> getGuestList() 
	{
		List<Guest> guestList = new ArrayList<Guest>();
		
		guestList.add(new Guest("Guest One"));
		guestList.add(new Guest("Guest Two"));
		guestList.add(new Guest("Guest Three"));
		guestList.add(new Guest("Guest Four"));
		
		return guestList;
	}
}
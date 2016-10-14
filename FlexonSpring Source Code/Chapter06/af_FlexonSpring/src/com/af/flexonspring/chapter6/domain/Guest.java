package com.af.flexonspring.chapter6.domain;

import java.io.Serializable;

public class Guest implements Serializable 
{
	private String guestName;

	public Guest(String guestName) 
	{
	      this.guestName = guestName;
	}
	 
	public String getGuestName() 
	{
		return guestName;
	}

	public void setGuestName(String guestName) 
	{
		this.guestName = guestName;
	}
}
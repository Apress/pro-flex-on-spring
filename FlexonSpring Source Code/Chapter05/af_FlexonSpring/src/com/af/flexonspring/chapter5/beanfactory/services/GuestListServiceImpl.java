package com.af.flexonspring.chapter5.beanfactory.services;

import java.util.List;

/**
 * Guest List bean
 */
public class GuestListServiceImpl implements GuestListService 
{
	private List<Object> guestList;
	
	/**
	 * Prints the guestList to the console
	 */
	public void printGuestList()
	{
	//	for(int i=0; i<guestList.toArray().length; i++)
	//	{
	//		System.out.println(guestList.toArray()[i]);
	//	}
		for(Object g : guestList){
			System.out.println(g);
		}
	}
	
	/**
	 * Gets the guestList
	 */
	public List<Object> getGuestList() {
	        return guestList;
	}

	/**
	 * sets the guestList
	 */
	public void setGuestList(List<Object> guestList)
	{
		this.guestList = guestList;
	}
}
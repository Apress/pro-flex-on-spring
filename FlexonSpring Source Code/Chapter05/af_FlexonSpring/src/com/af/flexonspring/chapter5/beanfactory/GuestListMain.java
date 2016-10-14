package com.af.flexonspring.chapter5.beanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.af.flexonspring.chapter5.beanfactory.services.GuestListService;

public class GuestListMain 
{
	public static void main(String[] args) throws Exception
	{
		ApplicationContext context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GuestListService guestListService = 
			(GuestListService) context.getBean("guestListService");
		
		guestListService.printGuestList();
	}
}
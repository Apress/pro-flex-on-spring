package com.af.springtests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.af.flexonspring.chapter5.beanfactory.services.GuestListService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "applicationContext.xml")
public class GuestListTests implements ApplicationContextAware
{
	private GuestListService guestListService;

	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext)
	{
		this.applicationContext = applicationContext;
	}
	
	@Before  
    public void init() 
	{  
		guestListService = 
			(GuestListService) applicationContext.getBean("guestListService");
    } 

	@Test
	public void testPrintGuestList()
	{
		guestListService.printGuestList();
	}
}
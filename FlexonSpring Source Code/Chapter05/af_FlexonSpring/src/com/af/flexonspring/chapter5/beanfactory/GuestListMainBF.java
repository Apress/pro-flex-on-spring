package com.af.flexonspring.chapter5.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.af.flexonspring.chapter5.beanfactory.services.GuestListService;

public class GuestListMainBF 
{
	public static void main(String[] args) throws Exception
	{
		BeanFactory factory = 
			new XmlBeanFactory(new FileSystemResource("c:/ApplicationContext.xml"));
		
		GuestListService guestListService = 
			(GuestListService) factory.getBean("guestListService");
		guestListService.printGuestList();
	}
}
package com.af.flexonspring.chapter5;

public class ConstructorInjectionBean
{
	private int age;
	
	public ConstructorInjectionBean() {};
	
	public ConstructorInjectionBean(int age)
	{
		this.age = age;
	}
	public int getAge() 
	{
		return this.age;
	}
}
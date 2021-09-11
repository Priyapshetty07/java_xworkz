package com.Chaining;

public class Book1 {
	String name;
	int noofpages;
	
	
	Book1()
	{
		this("classmates");
		System.out.println("Default parameterized cons....");
	}
	
	Book1(String name, int noofpages)
	{
		this.name=name;
		this.noofpages=noofpages;
		System.out.println("two parameterized cons....");
	}
	
	Book1(String name)
	{
		this("classmates",200);
		System.out.println("single parameterized cons....");
		
	}

}

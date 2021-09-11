package com.Chaining;

public class Book3 {
	String name;
	int noofpages;
	
	
	Book3()
	{
		this("classmates",200);
		System.out.println("Default parameterized cons....");
	}
	
	Book3(String name, int noofpages)
	{
		this.name=name;
		this.noofpages=noofpages;
		System.out.println("two parameterized cons....");
	}
	
	Book3(String name)
	{
		this();
		System.out.println("single parameterized cons....");
		
	}

}



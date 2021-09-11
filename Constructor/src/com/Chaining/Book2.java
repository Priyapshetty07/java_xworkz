package com.Chaining;

public class Book2 {
	String name;
	int noofpages;
	
	
	Book2()
	{
		this("classmates");
		System.out.println("Default parameterized cons....");
	}
	
	Book2(String name, int noofpages)
	{
		this.name=name;
		this.noofpages=noofpages;
		System.out.println("two parameterized cons....");
	}
	
	Book2(String name)
	{
		this("name",200);
		System.out.println("single parameterized cons....");
		
	}

}
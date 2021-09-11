package com.Chaining;

public class Book {
	String name;
	int noofpages;
	
	
	Book()
	{
		this("classmates");
	}
	
	Book(String name, int noofpages)
	{
		this.name=name;
		this.noofpages=noofpages;
	}
	
	Book(String name)
	{
		this("classmates",200);
		this.name=name;
	}

}

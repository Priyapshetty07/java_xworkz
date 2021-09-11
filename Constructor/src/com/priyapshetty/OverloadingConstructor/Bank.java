package com.priyapshetty.OverloadingConstructor;

public class Bank {
	String name;
    String location;
	String branch;
	long phoneNumber;
	
	Bank()
	{
		name="Andhra";
		location="shimoga";
		branch="durgigudi shivamogga";
		
	}
	
	Bank(String name, String location,String branch,long phoneNumber)
	{
		this.name=name;
		this.location=location;
		this.branch=branch;
		this.phoneNumber=phoneNumber;
		
		
	}
}
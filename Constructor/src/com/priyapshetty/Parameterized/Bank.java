package com.priyapshetty.Parameterized;

public class Bank {
	String name;
    String location;
	String branch;
	long phoneNumber;
	
	Bank()
	{
		name="Andhra";
		location="shimogaaa";
		branch="durgigudi shivamoggaaa";
		phoneNumber=9876543210l;
		
	}
	
	
	Bank(String name, String location,String branch,long phoneNumber)
	{
		this.name=name;
		this.location=location;
		this.branch=branch;
		this.phoneNumber=phoneNumber;
		
	}

}

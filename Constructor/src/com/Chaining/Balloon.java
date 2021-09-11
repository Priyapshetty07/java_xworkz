package com.Chaining;

public class Balloon {
	String color;
	double price;
	int size;
	
	Balloon()
	{
		System.out.println("default....");
		}
	
	Balloon(String color)
	{
	  System.out.println("single....");
	  }
	
	Balloon(String color,int size)
	{
		System.out.println("two param...");
	}
	
	Balloon(String color,int size,double price)
	{
		System.out.println("three param..");
	}

}

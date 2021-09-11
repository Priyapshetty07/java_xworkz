package com.priyapshetty.SIBsIIBsConstructor;

public class Charger {
	static String brand;
	String color;
	double price;
	String powerConsumption;
	
	{
		color =" Black";
		price =500.00;
		powerConsumption="5W";
		System.out.println("IIB 1");
	}
	
	{
		System.out.println("IIB 2");
	}
	
	static {
		System.out.println("SIB 1");
		brand ="Mi";
	}
	 
	static {
		System.out.println("SIB 2");
	}
	
	Charger()
	
	{
		System.out.println("constructor");
	}
}
	



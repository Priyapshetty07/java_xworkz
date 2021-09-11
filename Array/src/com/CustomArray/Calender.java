package com.CustomArray;

public class Calender {
	String name;
	String size;
	double price;
	String type;
	
	Calender(String name,String size,double price,String type)
	{
		this.name = name;
		this.size = size;
		this.price = price;
		this.type = type;
	}
    @Override
	public String toString() {
		return "Calender [name=" + name + ", size=" + size + ", price=" + price + ", type=" + type + "]";
	}
	

}

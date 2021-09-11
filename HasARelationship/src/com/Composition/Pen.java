package com.Composition;

public class Pen {
	String name;
	int price;
	String color;
	String features;
	Ink ink;
	
	void write() {
		System.out.println("will use pen for put signature");
	}

}

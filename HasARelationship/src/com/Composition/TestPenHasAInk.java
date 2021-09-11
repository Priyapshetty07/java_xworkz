package com.Composition;

public class TestPenHasAInk {
	public static void main(String[] args) {
		Pen pen= new Pen();
		pen.name="Rorito";
		pen.price=10;
		pen.color="Blue,Black,Red";
		pen.features="Ballpen,Inkpen";
		
		Ink ink= new Ink();
		ink.company ="Parker";
		ink.color="Blue,Black,Red";
		ink.price=30;
		pen.ink=ink;
		
		System.out.println("deatails of INK of the pen are");
		System.out.println(" INK Company Name: " + pen.ink.company);
		System.out.println(" INK Color: " + pen.ink.color);
		System.out.println(" INK price: " + pen.ink.price);
		
		

	}

}

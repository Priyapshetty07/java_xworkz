package com.Composition;

public class TestBirdHasAWings {
public static void main(String[] args) {
		
		Brid bird = new Brid();
		bird.name="Parrot";
		bird.color="colorful";
		bird.weight="1.6kg";
		bird.foodhabits="seeds,fruits";
		 
		Wing wing=new Wing();
		wing.color="red,green";
		wing.shape="passive soaring,active soaring,elliptical wings";
		wing.size="3.4meters";
		bird.wing=wing;
		
		System.out.println("DETAILS OF WINGS");
		System.out.println("parrot wings color: " +bird.wing.color);
		System.out.println("parrot wings shape: " +bird.wing.shape);
		System.out.println("parrot wings size: " +bird.wing.size);
		


	}


}

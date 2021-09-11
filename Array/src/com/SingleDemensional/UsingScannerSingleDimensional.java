package com.SingleDemensional;

import java.util.Scanner;

public class UsingScannerSingleDimensional {

	public static void main(String[] args) {
		String letter;
		Scanner src = new Scanner(System.in);
		String arr[]=new String[5];
		//System.out.println("Enter Array length : ");
		//letter=value.next();
		//declaration    	 
		System.out.print("Enter Element to Store in Array :\n");
		
		for(int i=0; i<arr.length; i++)
		{
		  arr[i] = src.next();
		}   
			        
		System.out.print("Elements in Array are :\n");
			        
		for(int i=0; i<arr.length; i++)
		{
	      System.out.print(arr[i] + "  ");
	    }  

	}

}

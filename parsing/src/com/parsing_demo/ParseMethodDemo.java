package com.parsing_demo;

public class ParseMethodDemo {

	public static void main(String[] args) {
    
		String s1 = "10";
		String s2 = "20";
		System.out.println("s1+s2 :" +s1+s2);

		Integer i = Integer.parseInt(s1);
		Integer j = Integer.parseInt(s2);
		
		System.out.println("i+j : "+(i+j));
		
		//System.out.println("i+j :"+i+j);
		//String + int = String
		//int + String = String
		
		String s3 = "true";
		System.out.println("s3 : " + Boolean.parseBoolean(s3));
	
	}

}

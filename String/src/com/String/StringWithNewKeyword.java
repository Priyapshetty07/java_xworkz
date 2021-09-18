package com.String;

public class StringWithNewKeyword {

	public static void main(String[] args) {
   
		String str = new String("Priya");
		
		String str1 = str.intern();
		
		String str2 = new String("Priya");
		String str3 = str2.intern();
		
		System.out.println(str1 == str3);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
	
		System.out.println(str == str2); 
		System.out.println(str == str1);
	}

}
 
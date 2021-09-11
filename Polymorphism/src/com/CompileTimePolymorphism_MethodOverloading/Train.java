package com.CompileTimePolymorphism_MethodOverloading;

public class Train {
	void searching(String a, String b)
	{
		System.out.println(a+ "has departed from shimoga at " +b);
		
	}
	
	void searching(int a, String b)
	{
		System.out.println(a+ "train number has departed from shimoga at " +b);
	}

}

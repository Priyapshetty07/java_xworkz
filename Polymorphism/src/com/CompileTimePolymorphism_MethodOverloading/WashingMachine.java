package com.CompileTimePolymorphism_MethodOverloading;

public class WashingMachine {
	void washing(int a,String b) {
		System.out.println(a+ " hours taken to wash:" +b);
	}
    void washing(String b,int a) {
    	System.out.println(b+ " time taken in hours : " +a);
    }

}

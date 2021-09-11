package com.CompileTimePolymorphism_MethodOverloading;

public class TestWachingMachine {
	public static void main(String...arg) {
		 WashingMachine wm = new WashingMachine();
		 wm.washing(1,"cloth");
		 wm.washing("For washing the cloth,",1);
	}


}

package com.CompileTimePolymorphism_MethodOverloading;

public class TestTrain {
public static void main(String[] args) {
		
		Train train = new Train();
		train.searching("Shathabhdi express" , "5:55am");
		train.searching(58421, "5:55am");
		

	}

}

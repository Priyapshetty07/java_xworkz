package com.Arrays;

import java.util.Arrays;

public class FruitArrays {

	public static void main(String[] args) {
		String[] fruitArray = {"Mango", "Apple","Orange","Kiwi","Pinapple"};
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(fruitArray));
		
		Arrays.sort(fruitArray);
		System.out.println("After Sort");
		System.out.println(Arrays.toString(fruitArray));
		
		String[] copiedArrays = Arrays.copyOf(fruitArray, 3);
		System.out.println("After copy");
		System.out.println(Arrays.toString(copiedArrays));
	
		String[] copiedArrayRange = Arrays.copyOfRange(fruitArray, 1, 3);
		System.out.println("After copy of range");
		System.out.println(Arrays.toString(copiedArrayRange));
       
		int index = Arrays.binarySearch(fruitArray,"Orange");
		System.out.println("Search for Orange"+index);
		
		
	}

}

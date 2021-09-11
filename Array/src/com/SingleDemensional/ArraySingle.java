package com.SingleDemensional;

public class ArraySingle {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		//int num=1;
		
		//System.out.println(arr);
		
		//arr[0] =1;
		 //arr[1]=2;
		//arr[2]=3;
		//arr[3]=4;
		//arr[4]=5;
		//arr[5]=6;
		
		for(int i=0; i<arr.length; i++)
		{
	     //  arr[i]= num;
	       // num++;
			arr[i]=i+1;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		
		
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
		//System.out.println(arr[4]);
	}

}
}

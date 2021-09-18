package com.StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("sb: "+sb);
		
		sb.append("table");
	    System.out.println("sb :" + sb);
	
	   sb.delete(1, 4);
	   System.out.println("after delete :" +sb);
	   
	   sb.insert(2, "ab");
	   System.out.println("After insert :" +sb);
	   
	}

}

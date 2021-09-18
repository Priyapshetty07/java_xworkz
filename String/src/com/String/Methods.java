package com.String;

public class Methods {

	public static void main(String[] args) {
		String str = "PRIYA";
		String str1 = "shetty";
	    //equals and equalsIgnoreCase 
		String str2 = "priya";
		String str3 = "PRIYA";
		
		String str4 ="shimoga";
		
		//lowercase
		String lowercasestr = str.toLowerCase();
		System.out.println(lowercasestr);
		
		System.out.println("------------------------");
		
		//uppercase
		String uppercasestr = str1.toUpperCase();
		System.out.println(uppercasestr);
		
		System.out.println("------------------------");
		
		//equals
		System.out.println(str2.equals(str3));
		
		System.out.println("------------------------");
		
		//equalsIgnoreCase
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println("------------------------");
		
		//getBytes by using for each
		byte[] byteArray = str.getBytes();
		System.out.println("byteArray of str is:"+byteArray);
		for(byte i: byteArray)
		{
			System.out.println(i);
		}
		
		System.out.println("----------------------");
		
		
		//getBytes by using for loop
		for(int i=0; i<byteArray.length; i++)
		{
			int a=byteArray[i];
			System.out.println(a);
		}
		
		System.out.println("------------------------");
		
		//length
		System.out.println(str.length());
		
		System.out.println("------------------------");
		
		//Char
		char i = str.charAt(2);
        System.out.println("char at 2 : "+i);
        
        System.out.println("---------------------");
        
        //concationtedString
       String concationtedString = str.concat(str1);
       System.out.println("concationtedString : " +concationtedString);
	
       System.out.println("----------------------");
       
       //index
       System.out.println("index of i in PRIYA :"+ str.indexOf('Y'));
       
       System.out.println("------------------------");
       
       //isEmpty
       System.out.println("is string PRIYA: "+ str.isEmpty());
       
       System.out.println("------------------------");
       
       //length
       System.out.println();
       System.out.println("length :"+str4.length());
        
       //match
       System.out.println();
       System.out.println("match:" + str4.matches(str4));
       
       System.out.println();
       System.out.println("match:" + str.matches(str4));
       
       System.out.println("------------------------");
       
       //Replace
       System.out.println();
       System.out.println("Replace:"+str4.replace(str2,str3));
       
       System.out.println();
       System.out.println("Replace:"+str2.replace('i','a'));
       
       String str5 = "Hello Java. Java is a language.";
	   System.out.println("ReplaceAll:"+ str5.replace("Java.", "c++"));
		
	   System.out.println("------------------------");
	   
	   //Replace All
	   System.out.println("ReplaceAll:"+ str5.replaceAll("Java.", "c++"));
		
	   System.out.println("------------------------");
	   
		//startwith
	   String str6 = "My name is priya p shetty";
	   System.out.println("StartWith: "+ str6.startsWith("My"));
	   System.out.println("StartWith: "+ str6.startsWith("my"));
	   System.out.println("StartWith: "+ str6.startsWith("My name is"));
	   
	   System.out.println("StartWith PRIYA-P: "+ str.startsWith("P"));
	   System.out.println("StartWith PRIYA-r: "+ str.startsWith("r"));
	   System.out.println("StartWith PRIYA-Y: "+ str.startsWith("Y",3));
	   
	   //Split
	   for(String w:str6.split("\\s")) {
       	System.out.println("split---My name is priya p shetty: "  +w);
	   }
	   
      }

}


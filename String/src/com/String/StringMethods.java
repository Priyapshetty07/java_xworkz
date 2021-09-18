package com.String;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = "gowri";
		String str1 = "ganesha";
		
		String uppercaseStr = str.toUpperCase();
        System.out.println("uppercase letter : " + uppercaseStr);
	
        System.out.println(str);
        
        char a = str.charAt(2);
        System.out.println("char at 2 : "+a);
        
       String concationtedString = str.concat(str1);
       System.out.println("concationtedString : " +concationtedString);
	
       System.out.println("is concatinastedString containd ganesga : " + concationtedString.contains("ganesha"));
    
       System.out.println("index of i in gowri :"+ str.indexOf('i'));
	
       System.out.println("is string GOWRI: "+ str.isEmpty());
       
       System.out.println("is string empty:"+"".isEmpty());
	
      
	}

}

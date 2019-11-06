package com.class13;

public class RegularExpressions {
	public static void main(String[] args) {
		
		String str="-*#&$(<14He3404l320l22o>)$&#*-";
		
		
		
		  System.out.println(str.replaceAll("[0-9]",""));
		  
		  System.out.println(str.replaceAll("[^0-9]",""));
		  
		  System.out.println(str.replaceAll("[a-zA-Z]",""));
		  
		  System.out.println(str.replaceAll("[^a-zA-Z]",""));
		  
		  System.out.println(str.replaceAll("[a-zA-Z0-9]",""));
		  
		  System.out.println(str.replaceAll("[^a-zA-Z0-9]","."));
		 
	}

}

package com.class12;

public class StringManipulation {
	public static void main(String[] args) {
		
		///////////////////////
		
		String name="Jack";
		System.out.println(name);
		System.out.println(name.length());
		
		
		///////////////////////
		
		String name1=new String("Jack");
		System.out.println(name1);			
		
		
		///////////////////////
		
		String str="HELLO World";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		///////////////////////
		
		String str2="hellO worLD";
		boolean isEqual=str.equals(str2);
		System.out.println(isEqual);
		System.out.println(str.equalsIgnoreCase(str2));
		
		
	}

}

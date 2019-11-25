package com.class25;

public class OverloadingMainMethod {
	
	public static void main(String str) {
		System.out.println("Main method with string");
		
	}
	public static void main(String[] args) {
		System.out.println("Main method with string array");
		main("string");
		String [] array= {"hi","vay"};
		main(array, "hello");
	}
	
	public static void main(String[] args, String str) {
		System.out.println("Main method with 2 parameters");
	
	}
}

package com.class27;

public class FinalKeyword {
	final void finalMethod() {
		System.out.println("cool");
	}
	
	final void finalMethod(int a ) {
		System.out.println("cooler");
	}
	
	
	public static void main(String[] args) {
		
		String str="I am awesome";
		str="I am cool";
		System.out.println(str);
	
		final String str1="Java is easy";
		// str1="Java is hard";
		// compiler error because final methods cannot be overridden
		//final methods can be overloaded
		
		
		
	}

}
/*
 * class test extends FinalKeyword{ void finalMethod() {
 * System.out.println("dfdfd"); } }
 */

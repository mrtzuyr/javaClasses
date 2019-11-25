package com.class24;

public class ThisWithConstructor {
	
	public ThisWithConstructor() {
		System.out.println("This is non argument constructor");
	}
	
	ThisWithConstructor(String str){
		this();
		System.out.println("This is the constructor with one parameter "+str);
	}
	
	ThisWithConstructor(String str, String str1){
		this(str);
		System.out.println("This is the constructor with 2 parameters");
	}
	
	public static void main(String[] args) {
		
		ThisWithConstructor obj=new ThisWithConstructor("hello");
		
		System.out.println("~~~~~");
		
		ThisWithConstructor obj1= new ThisWithConstructor("hi", "bye");
		
	}
}

package com.class24;

public class Homework2 {
	/*
	 * Write a program that will have 2 Constructors. 
	 * While creating an object make sure:
	 * Instance variables are being initialized
	 * Both Constructors are being executed
	 */
	
	public Homework2() {
		System.out.println("I am a non-argument constructor");
	}
	
	public Homework2(String str) {
		this();
		System.out.println("I am a constructor with a parameter "+str);
	}
	public Homework2(String str, int num) {
		this("test");
		System.out.println("Method inside method "+str+" "+num);
	}	
	
	
	public static void main(String[] args) {
		
	  //Homework2 obj=new Homework2("wow");
		Homework2 obj =new Homework2("yeah", 3);
		
	
		
	}
}

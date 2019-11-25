package com.class25;

public class Overloading {
	
	//two methods can have the same name. is called overloading
	
	//by passing different amount of parameters
	public void add (int a, int b) {
		System.out.println(a+b);
	}
	
	public void add (int a, int b, int c) {
		System.out.println(a+b+b);
	}
	
	//by having different types of parameters
	public void add(int a, double b) {
		System.out.println(a+b);
	}


}
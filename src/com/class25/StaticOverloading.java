package com.class25;

public class StaticOverloading {
	
	static void a() {
		System.out.println("This is a static method without any parameters.");
	}
	
	static void a(String str) {
		System.out.println("This is a static method with a string parameter. Result is "+str);
	}
	
	static void a(int num) {
		System.out.println("This is a static method with a integer parameter. Result is "+num);
	}
	
	public static void main(String[] args) {
		
		a();
		a("cool");
		a(21);
	}
}

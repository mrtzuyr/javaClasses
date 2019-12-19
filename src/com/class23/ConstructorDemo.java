package com.class23;

public class ConstructorDemo {
	
	/*
	 * ConstructorDemo(){
	 * 
	 * }
	 */
	
	  ConstructorDemo() { System.out.println("I am your constructor"); }
	 
	
	ConstructorDemo(String str){
		System.out.println("I am constructor with 1 parameter "+str);
	}
	
	ConstructorDemo(int num){
		System.out.println("I am constructor with 1 parameter "+num);
	}
	ConstructorDemo(int num, int num1){
		System.out.println("I am constructor with 1 parameter "+num+" "+num1);
	}

	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println("Code after creating an object");
		
		ConstructorDemo obj2=new ConstructorDemo("my parameter");
		
		ConstructorDemo obj3=new ConstructorDemo(123);
		
		ConstructorDemo obj4=new ConstructorDemo(123,321);
	}

}

package com.class5;

public class LogicalNot {public static void main(String[] args) {
	
	boolean b1=!true;
	boolean b2=!false;
			
	System.out.println(b1);
	System.out.println(b2);
	
	boolean traffic=true;
	
	if(!traffic) {
		System.out.println("hello");
	}else {
		System.out.println("bye");
	}
	
	boolean isRain=false;
	if(!isRain) {
		System.out.println("Take umbrealla");
	}else {
		System.out.println("Don't take umbrella");
	}
	
	int num1=10, num2=11;
	if(num1==num2) {
		System.out.println("Numbers are equal");
	}else {
		System.out.println("Numbers are not equal");
	}
	
	
	if (!(num1==num2)) {
		System.out.println("Numbers are NOT equal");
	}else {
		System.out.println("Numbers are equal");
	}
	
	
	// if name is Marry or Anna then you are my sister
	
	String name="Mary";
	String name2="Anna";
	
	if(!(name.equals("Mary") || name2.equals("Anna"))) {
		System.out.println("You are not my sister");
	}else {
		System.out.println("You are my sister");
	}
	
	
	
	
	}

}

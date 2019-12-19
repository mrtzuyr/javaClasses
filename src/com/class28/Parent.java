package com.class28;

public class Parent {
	String name="Jordan";
	
	void callName() {
	
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		
		obj.callName();
		
		
	
	}
}

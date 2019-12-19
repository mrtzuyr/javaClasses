package com.class28;

public class Child extends Parent {
	String name="John";
	
	void callName() {
		System.out.println(name);
		System.out.println(super.name);
		super.callName();
	}
}

package com.class31;

public class Parent {
	static void hello() {
		System.out.println("Hello from Super class");
	}

	public static void main(String[] args) {
		
			
			Parent p=new Child();
			p.hello();
		}
	}
//method hiding by declaring as static

class Child extends Parent {
	
	static void hello() {
		System.out.println("Hello from sub class");
	}
}
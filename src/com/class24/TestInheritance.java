package com.class24;

public class TestInheritance {
	public static void main(String[] args) {
		
		Child1 child1=new Child1();
		System.out.println(Child1.race);
		System.out.println(child1.hairColor);
		child1.sing();
		
		Child2 child2=new Child2();
		System.out.println(Child2.race);
		System.out.println(child2.eyeColor);
		child2.sing();
		child2.soccer();
	}
}

package com.class26;

public class Animal {

	void sleep () {
		System.out.println("Animals sleep");
	}
	
	void eat() {
		System.out.println("Animals eat");
	}
	
	
}

class Cat extends Animal{
	void sleep() {
		System.out.println("Cats sleep all day");
	}
	
	void meow() {
		System.out.println("Cats meow when they are hungry");
	}
}
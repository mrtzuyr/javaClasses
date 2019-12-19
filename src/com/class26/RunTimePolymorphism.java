package com.class26;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		//creating an object on parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		
		//creating an object on child class
		Cat cat=new Cat();
		cat.eat();//from parent
		cat.sleep();//from child
		cat.meow();//from child
		
		double d=90; //widening happens automatically
		int i=(int)1.99; //narrowing needs to be done manually
		
		//Non-primitive Typecasting
		
		Animal obj=new Cat();//narrowing
		obj.eat();//coming from parent
		obj.sleep();//this will come from child class because it is overrode ->>Run time polymorphism
		//obj.meow(); compiler error
		
	}
}

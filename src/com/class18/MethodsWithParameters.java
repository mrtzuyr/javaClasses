package com.class18;

public class MethodsWithParameters {
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
	
	public static void main(String[] args) {
		
		MethodsWithParameters obj=new MethodsWithParameters();
		obj.sayHello("Asel");
		obj.sayHello("Diego");
		obj.sayHello("Weqas");
		obj.sayHelloInDifferentLanguage("USA");
		obj.sayHelloInDifferentLanguage("Mexico");
		obj.sayNameAndAge("Jack", 36);
		obj.sayNameAndAge("Olga", 54);
		obj.isSnowing(false);
	}
	
	void sayHelloInDifferentLanguage(String country) {
		switch(country.toLowerCase()) {
		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "mexico":
			System.out.println("Hola");
			break;
			default:
				System.out.println("Unknown language");
		}
	}
	
	
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
	
	
	
	void isSnowing(boolean isSnowing) { //method header
		
		if(isSnowing) {
			System.out.println("Stay home");
		}else {
			System.out.println("Go for a walk");
		}
	}

}

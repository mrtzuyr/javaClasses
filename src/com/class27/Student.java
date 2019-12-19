package com.class27;

public class Student {
	/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
	  Define common behavior within parent class and override some of the methods in child classes
	  Define some methods specific to child classes
	  Write example of achieving run time polymorphism
    */
	
	void study() {
		System.out.println("Students study.");
	}
	
	private void exam() {
		System.out.println("Students take exams.");
	}
	

	
}
class SyntaxStudent extends Student{
	@Override
	void study() {
		System.out.println("Syntax students study more.");
	}
	
}

class CollegeStudent extends Student{
	
	void study() {
		System.out.println("College students don't study a lot.");
	}
	
	void dorm() {
		System.out.println("College students stay at dorms.");
	}
	
}

class SchoolStudent extends Student{
	
	void exam() {
		System.out.println("Shool students don't like exams.");
	}
	
	void parent() {
		System.out.println("There are parent-teacher conferences in schools.");
	}
	
}

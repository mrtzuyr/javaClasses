package com.class24;

public class Homework1 {
	/*
	 * Write program as a Student class that has instance variables name and address. 
	 * Create a constructor that will initialize those variables. 
	 * Print name & address of given  student by the displayInfo method.
	 */
	
	String name, address;
	
	Homework1(){}
	
	Homework1 (String name, String address){
		this.name=name;
		this.address=address;
	}
	
	void info() {
		System.out.println(name+" lives in "+address);
	}
	
	public static void main(String[] args) {
		Homework1 s1=new Homework1("James", "Conway");
		Homework1 s2=new Homework1("Jessica", "Sherwood");
		Homework1 s3=new Homework1("Adam", "Benton");
		Homework1 s4=new Homework1("Martha", "Maumelle");
		
		s1.info();	s2.info();	s3.info();	s4.info();
	}
}

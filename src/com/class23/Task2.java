package com.class23;

public class Task2 {
	/*
	 * Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. 
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name.
	 */
	
	String name;
	int grade1, grade2, grade3;
	
	Task2(){}
	
	Task2(String name1, int gr1,int gr2, int gr3){
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
		name=name1;
	}
	
	void average() {
		System.out.println("The average grade of "+name+" is "+(grade1+grade2+grade3)/3);
	}
}

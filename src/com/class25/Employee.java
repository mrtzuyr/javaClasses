package com.class25;

public class Employee {
	
	int salary;
	static String companyName;
	protected String employeeId;
	private String employeeSSN;
	void work() {
		System.out.println("I work at "+companyName);
	}
	
	void getPaid() {
		System.out.println("I get paid $"+salary);
	}
	
	
}

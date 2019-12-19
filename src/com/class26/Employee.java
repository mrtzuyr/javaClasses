package com.class26;

public class Employee {
	
	int salary;
	
	public void getPaid() {//overrode
		System.out.println("Employee gets paid $"+salary);
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.salary=90000;
		emp.getPaid();
		
		FullTime obj=new FullTime();
		obj.salary=80000;
		obj.bonus=12000;
		obj.getPaid();
	}

}

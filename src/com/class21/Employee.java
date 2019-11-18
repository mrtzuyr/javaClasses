package com.class21;

public class Employee {
	/*.Create a Class called Employee:
	 * ●Create three  variables  eID , salary and set the CEO to “Sumair” 
	 * ●Create two objects of the class Employee 
	 * ●Set the value of eID, salary for each of the objects
	 * ●Print out the eID , salary and  CEO for each of the objects 
	 */
	int eID, salary;
	static String CEO="Sumair";
	
	void displayInfo() {
		System.out.println("The employee with the ID "+eID+" makes "+salary+" dollars annually "
				+ "at the company managed by "+CEO);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		System.out.println("The CEO is "+CEO);
		
		e1.eID=216;
		e1.salary=25000;
		
		e2.eID=319;
		e2.salary=32000; 
		
		Employee.CEO="Asel";
		// CEO will be the same, it is static in the class
		
		e1.displayInfo();
		e2.displayInfo();
	}
	
}

package com.class36;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Person {
	
	/*
	 * Create a Person class with following private fields: name, lastName, age, salary. 
	 * Variables should be initialized through constructor.
	 * Inside the class also create a method to print user details.
	 * In Test Class create a Map that will store key in ascending order. 
	 * In that map store personId and a Person Object. Print each object details.
	 */
	
	private String name, lastName;
	private int age,salary;
	
	public Person(String name, String lastName, int age, int salary) {
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	
	void display() {
		System.out.println(name+" "+lastName+" is "+age+" years old and makes "+salary+" annually.");
	}
	
	
	public static void main(String[] args) {
		
		Map<Integer, Person>person=new TreeMap<>();
		person.put(12345, new Person("Kevin","Malone",48, 42000));
		person.put(53445, new Person("Toby","Flenderson",43, 52000));
		person.put(74564, new Person("Michael","Scott",52, 65000));
		person.put(42547, new Person("Jim","Halpert",34, 54000));
		
		Set<Entry<Integer, Person>>display=person.entrySet();
		
		for(Entry<Integer, Person>set:display) {
			
			set.getValue().display();
			
			
		}
		
		
	}
	
}



	


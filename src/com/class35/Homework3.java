package com.class35;

import java.util.HashSet;
import java.util.Set;

public class Homework3 {
	
	String name;
	int id;
	
	Homework3(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	void display() {
		System.out.println("Name: "+name+", Student id: "+id);
	}
	
	public static void main(String[] args) {
		/* Create a Set collection that will hold Objects of Student Type. 
		 * In this set we do not care about the insertion order. Each student object should have name and studentID. 
		 * Display name of each student.
		 */
		
		
		
		Set<Homework3>list=new HashSet<>();
		
		list.add(new Homework3("Jack",127346));
		list.add(new Homework3("Ali",942356));
		list.add(new Homework3("John",122356));
		list.add(new Homework3("Mary",983356));
		list.add(new Homework3("Jim",345678));
		
		for(Homework3 el:list) {
			el.display();
		}
	}
}

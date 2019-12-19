package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	String name;
	int id;
	
	public Student(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	public void display() {
		System.out.println("My name is "+name+" and my student id is "+id);
	}
	
	public static void main(String[] args) {
		
		List<Student>students=new ArrayList<>();	
		
		Student stu=new Student("John",101);
		Student stu1=new Student("Jane",102);
		Student stu2=new Student("Jack",103);
		
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		//display of each student one by one
		stu.display();
		
		//display all with for each
		for(Student all:students) {
			all.display();
		}
		
		//adding more object adding it to ArrayList
		students.add(new Student("Adam",104));
		students.add(new Student("Elon",105));
		
		//display by using iterator
		Iterator<Student>it=students.iterator();
		while(it.hasNext()) {
			it.next().display();
		}
	}
}

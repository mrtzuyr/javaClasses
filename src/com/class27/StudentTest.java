package com.class27;

public class StudentTest {
	public static void main(String[] args) {
		
		SyntaxStudent student1=new SyntaxStudent();
		student1.study();
		//student1.exam();
		
		Student student2=new CollegeStudent();
		student2.study();
		//student2.dorm();
		
		Student student3=new SchoolStudent();
		student3.study();
		
		
		SchoolStudent student4=new SchoolStudent();
		student4.study();
		student4.parent();
		student4.exam();
	}
}

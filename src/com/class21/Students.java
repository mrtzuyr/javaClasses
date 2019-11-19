package com.class21;

public class Students {
	
	/* Create a Class called Students
	 * ●Create three  variables  studentName , studentID  and  numberOfStudents
	 * ●Create three objects of the Students Class 
	 * ●Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	 * ●Print out  total number of students
	 */
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	void displayInfo() {
		System.out.println("Name: "+studentName+"\nStudent ID: "+studentID);
	}
	
	public static void maids(String[] regr) {
		
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		
		s1.studentName="John";
		s1.studentID=45;
		Students.numberOfStudents++;
		
		
		s2.studentName="Jim";
		s2.studentID=54;
		Students.numberOfStudents++;
		
		s3.studentName="Jack";
		s3.studentID=265;
		Students.numberOfStudents++;
		
		s1.displayInfo();
		s2.displayInfo();
		s3.displayInfo();
	
		System.out.println("The total number of students is "+Students.numberOfStudents);
		
	}
	
}

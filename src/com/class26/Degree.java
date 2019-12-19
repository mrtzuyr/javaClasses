package com.class26;

public class Degree {

	public void getDegree() {
		System.out.println("I have a degree");
	}
	
	public static void main(String[] args) {
		
		
		Degree obj=new Degree();
		obj.getDegree();
		
		Undergraduate obj1=new Undergraduate();
		obj1.getDegree();
		
		Postgraduate obj2=new Postgraduate();
		obj2.getDegree();
	}
}

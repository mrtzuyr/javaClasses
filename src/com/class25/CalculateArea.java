package com.class25;

public class CalculateArea {
	
	void area(int a) {
		System.out.println("The area of the square is "+(a*a));
	}
	
	void area(int a, int b) {
		System.out.println("The area of the rectangle is "+(a*b));
	}
	
	void area(int a,int b, int c) {
		System.out.println("The area of the box is "+(2*((a*b)+(b*c)+(a*c))));
	}
	
	public static void main(String[] args) {
		CalculateArea obj=new CalculateArea();
	
		
		obj.area(12,16);
		obj.area(10);
		obj.area(2, 4,5);
}
}
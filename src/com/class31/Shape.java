package com.class31;

public interface Shape {
	/*
	 * Create an Interface ‘Shape’ with undefined methods as calculateArea and 
	 * calculatePerimiter . Create 2 child classes: Circle & Square that should have an 
	 * implementation of area and perimeter calculation. Test your code.
	 */
	
	void calculateArea(int num);
	void calculatePerimeter(int num);

}

class Circle implements Shape{
	
	final double pi=3.14;
	
	public void calculateArea(int radius) {
	System.out.println(pi*radius*radius);	
	}
	public void calculatePerimeter(int radius) {
		System.out.println(2*pi*radius);
	}
}
class Square implements Shape{
	int side=4;
		@Override
		public void calculateArea(int side) {
			System.out.println(side*side);
			
		}

		@Override
		public void calculatePerimeter(int side) {
			System.out.println(4*side);
		}
	
}

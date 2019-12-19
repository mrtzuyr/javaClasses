package com.class28;

public class Shape {
	/* Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. 
	 * In circle class create a method to calculate the area of circle. Test your code
	 */
	
	int radius;
	
	Shape(){}
	
	Shape(int radius){
		this.radius=radius;
	}
	
	public static void main(String[] args) {
		Circle obj=new Circle(3);
		obj.area();
	}
	
}

class Circle extends Shape{
	
	Circle(int radius){
		super(radius);
	}
	
	void area() {
		System.out.println(super.radius*super.radius*3.14);
		
	}
}

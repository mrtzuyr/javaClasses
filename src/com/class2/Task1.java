package com.class2;
/**
 * 
 * @author murta
 *
 */
public class Task1 {
	public static void main(String[] args) { 
		/*
		 * 1.Write a Java program to add, 
		 * subtract, multiply and divide 2 decimal values. 
		 * Your program should say. “The _______ of 2 numbers ___ and ___ is 
		 * equal to _____” 
		 * 2.Write a program to find the square of the 
		 * number 3.9. You program should say “The square of the ____ is ____ "
		 * 3.Write a program to print the area and perimeter of a rectangle 
		 * with width = 5 and  height = 8. Your program should say. 
		 * “The perimeter of a rectangle with width ___ and height ____ is 
		 * equal to _____ and the area is __”
		 */
		
		//1
		
		double num1, num2;
		num1=4.5;
		num2=1.5;
		double add=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
		
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+add);
		System.out.println("The substraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+num1/num2);
		
		//2
		
		double num3=3.9;
		double sq=num3*num3;
		
		System.out.println("The square of the "+num3+" is "+sq);
		
		//3
		
		int w=5;
		int h=8;
		int ar=w*h;
		int p=(w+h)*2;
		
		System.out.println("The perimeter of a rectangle with width "+w+" and height "+h+" is equal to "
				+p+" and the area is "+ar);
		
		
		
	}

}

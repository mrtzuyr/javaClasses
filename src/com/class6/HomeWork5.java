package com.class6;

import java.util.Scanner;

public class HomeWork5 {
	public static void main(String[] args) {
		/*
		 * HomeWork: Using scanner class create calculator.
		 *  Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */
		Scanner scan=new Scanner(System.in);
		int num1, num2;
		System.out.println("Please enter the first number");
		num1=scan.nextInt();
		System.out.println("Please enter an operator");
		String op=scan.next();
		if(!(op.equals("*")||op.equals("/")||op.equals("+")||op.equals("-"))) {
			System.out.println("Please enter a valid operator");
			}else {
				System.out.println("Please enter the second number");
			}
	
		num2=scan.nextInt();
		
		
		switch(op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
			default:
				System.out.println("Please enter a valid operator");
			
		}
	}

}

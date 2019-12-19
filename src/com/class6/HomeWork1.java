package com.class6;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..
		 * if and logical operators provided by a user
		 *  (numbers must be distinct)
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 different numbers");
		double num1,num2,num3,largestNumber;
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
		
		
		if(num1>num2 && num1>num3) {
			largestNumber=num1;
		}else if(num2>num1 && num2>num3) {
			largestNumber=num2;
		}else {
			largestNumber=num3;
		}
		
		System.out.println("The largest number is "+largestNumber);
		
		scan.close();
	}

}

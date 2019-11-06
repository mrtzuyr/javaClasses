package com.class4;

import java.util.Scanner;

public class ScannerTask3 {
	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary.
		 *  If user worked for more or equals to 5 years than user is eligible for the bonus,
		 *   otherwise he is not.Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 *   otherwise bonus=3000.
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers of worked years");
		int y=s.nextInt();
		
		
		if(y>=5) {
			System.out.println("You are eligible for bonus. Enter annual salary");
			int salary=s.nextInt();
			if(salary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
		}else {
			System.out.println("Sorry, you are not eligible for bonus");
		}
	}

}

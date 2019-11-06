package com.class6;

import java.util.Scanner;

public class HomreWork4 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 * 
		 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your grade");
	char grade=scan.next().charAt(0);
	String grading;
	switch(grade) {
	case 'A':
		grading="Excellent";
		break;
	case 'B':
		grading="Good";
		break;
	case'C':
		grading="Average";
		break;
	case'D':
		grading="Bad";
		break;
		default:
			grading="Not acceptaple";
	}
	System.out.println("Your grade is "+grade+". "+grading+"!!!");
	}

}

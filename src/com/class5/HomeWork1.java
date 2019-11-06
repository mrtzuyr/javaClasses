package com.class5;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules:
		 * ●if the average score >=90 → grade=A
		 * ●if the average score >= 70 and <90 → grade=B
		 * ●if the average score>=50 and <70 → grade=C
		 * ●if the average score<50 → grade=F
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is your quiz score?");
		int q=scan.nextInt();
		System.out.println("What is your mid term score?");
		int m=scan.nextInt();
		System.out.println("What is your final score?");
		int f=scan.nextInt();
		
		int av=(q+m+f)/3;
		String grade;
		
		if(av>=90) {
			grade="A";
		}else if(av>=70 && av<90) {
			grade="B";
		}else if(av>=50 && av<70) {
			grade="C";
		}else {
			grade="F";
		}
		
		System.out.println("Your grade is "+grade);
		
		
	}

}

package com.class19;

import com.class20.Review;

public class Task {
	//TASK 1
	String createEmail(String name, String lastName, String type) {
		String email=name+lastName+"@"+type+".com";
		return email;
	}
	
	//TASK 2
	boolean isPrime(int num) {
		boolean isPrime=true;
		if(num<=1) {
			isPrime=false;
		}else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	
	
	//TASK3
	char getGrade (int score) {
		char grade;
		if(score>=90) {
			grade='A';
		}else if(score>=80&& score<90) {
			grade='B';
		}else if(score>=70 && score <80) {
			grade='C';
		}else if(score>=50 && score <70) {
			grade='D';
		}else {
			grade='F';
		}
		return grade;
		
	}
	
	
	public static void main(String[] args) {
		Task obj=new Task();
		
		String email=obj.createEmail("murtaza", "uyar", "gmail");
		System.out.println(email);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		boolean prime=obj.isPrime(8);
		System.out.println(prime);
		if(prime) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		char grade=obj.getGrade(75);
		System.out.println(grade);
	
	
	}
}

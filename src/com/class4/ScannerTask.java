package com.class4;

import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		Scanner loan=new Scanner(System.in);
		
		System.out.println("Please type the amount of loan you need");
		int num=loan.nextInt();
		if(num<200000) {
			System.out.println(num+" will be ready for you");
		}else {
			System.out.println(num+ " is too much. You are rejected");
		}
		System.out.println("************************************");
		
		
		System.out.println("Please enter your age");
		int num2=loan.nextInt();
		if(num2>=18) {
			System.out.println("You are qualified for driver's licence");
		}else if(num2>=16) {
			System.out.println("You are qualified for driver's permit");
		}else {
			System.out.println("You cannot drive");
			
		}
		System.out.println("**************************************");
		
		System.out.println("Please enter city");
		String city=loan.next();
		System.out.println("Please enter temperature");
		double tem=loan.nextDouble();
		double cel=(tem-32)*5/9;
		System.out.println("The temperature in your city "+city+" is "+cel+" celcius");
		
		
		
	}

}

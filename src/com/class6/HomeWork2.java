package com.class6;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		/*
		 * Program to find largest number among three numbers using nested if provided by a user 
		 * (numbers must be distinct)
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter 3 different numbers");
		
		int num1,num2,num3;
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
	    if(num1>num2) {
	           if (num1>num3) {
	               System.out.println("The largest number is "+num1);
	           }
	       }else if(num2>num1) {
	           if(num2>num3) {
	               System.out.println("The largest number is "+num2);
	           }
	       }
	    if(num3>num1) {
	           if(num3>num2) {
	               System.out.println("The largest number is "+num3);
	           }
	       }
		
	       double no1 = scan.nextDouble();
	        double no2 = scan.nextDouble();
	        double no3 = scan.nextDouble();
		
		   if (no1>no2) {
	            if(no1>no3) {
	                System.out.println("Largest number is first - " + no1);
	            } else {
	                System.out.println("Largest number is third - " + no3);
	            }
	        }else {
	            if(no2>no3) {
	            System.out.println("Largest number is second - "+ no2);
	            } else {
	                System.out.println("Largest number is third - " + no3);
	            }
	        }
		
		
	}

}

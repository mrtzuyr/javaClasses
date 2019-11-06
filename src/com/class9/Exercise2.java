package com.class9;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		/*Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints 
		 * the sum of the even and odd integers.
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the start point");
		int a=scan.nextInt();
		System.out.println("Enter the end point");
		int b=scan.nextInt();
		
		int start=0;
		int end=0;
		if(a<b) {
			start=a;
			end=b;
		}else {
			start=b;
			end=a;
		}
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=start; i<=end; i++) {
			if (i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
			
			
		}
		System.out.println("The total of even numbers between "+a+" and "+b+" is "+sumEven);
		System.out.println("The total of odd numbers between "+a+" and "+b+" is "+sumOdd);
	}

}

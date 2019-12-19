package com.class7;

public class DoWhileLoop {
	public static void main(String[] args) {
		// MOSTLY USED
		 int num1=8;
		 while (num1<=7) {
			 System.out.println("bye");
			 num1++;
		 }
		// RARE
		int num=10;
		do {
			System.out.println("bye");
			num++;
		}while(num<=7);
		
		System.out.println("**************************************");
		
		
		// print even numbers from 20 to 50 using do while
		
		int n=20;
		do {
			System.out.println(n);
		    n+=2;
		}while (n<=50);
		
		System.out.println("-------------Second way---------");
		// 2 way
		int even1=20;
		do {
			if (even1 % 2 == 0) {
				System.out.println(even1);
			}
			even1++;
		} while (even1 <= 50);
		
		
		
		
		
		
		
		
	}

}

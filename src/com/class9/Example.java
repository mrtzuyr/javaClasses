package com.class9;

public class Example {
public static void main(String[] args) {
	
	for(int a=1; a<=3; a++) {
		for(int b=1; b<=a; b++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("-------------------------------");
	
	
	for(int a=1; a<=9; a++) {
		for(int b=1; b<=a; b++) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	System.out.println("-------------------------------");
	
	for(int a=9; a>=1; a--) {
		for(int b=9; b>=a; b--) {
			System.out.print(b);
		}
		System.out.println();
	}
	
	System.out.println("-------------------------------");
	
	for(int a=9; a>=2; a--) {
		for(int b=1; b<=a; b++) {
			System.out.print(b);
		}
		System.out.println();
	}
	for(int a=1; a<=9; a++) {
		for(int b=1; b<=a; b++) {
			System.out.print(b);
		}
		System.out.println();
	}
	
	
}
}

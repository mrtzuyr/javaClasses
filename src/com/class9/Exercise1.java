package com.class9;

public class Exercise1 {
	public static void main(String[] args) {
		for(int a=5; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
		}
		System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=4; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

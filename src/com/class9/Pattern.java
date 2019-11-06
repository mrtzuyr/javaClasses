package com.class9;

public class Pattern {
	public static void main(String[] args) {
		
		for(int k=1; k<=5; k++) {//rows
			for(int l=1; l<=5; l++) {//columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		/* 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		
		for(int k=1; k<=5; k++) {
			for(int l=1; l<=5; l++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		/* 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		for(int k=1; k<=5; k++) {
			for(int l=1; l<=5; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		/* 54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		
		for(int a=5; a>=1; a--) {
			for(int b=5; b>=1; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		/* 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		for(int a=5; a>=1; a--) {
			for(int b=0; b<=5; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

}

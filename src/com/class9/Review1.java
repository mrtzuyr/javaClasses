package com.class9;

public class Review1 {
	static void odometer() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					for (int k = 0; k < 10; k++) {
						System.out.println(i+" "+j+" "+j2+" "+k);
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
	
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print("?");
			}
			System.out.println();
		}
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(j);
			}
		System.out.println();
		}
		
		for (int i = 5; i >=1; i--) {
			for (int j = 5; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//odometer();
	}
}

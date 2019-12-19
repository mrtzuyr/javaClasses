package com.class11;

import java.util.Arrays;

public class Review {

	static int[][] a = { { 12, 13, 14 }, { 15, 16, 17 }, { 18, 19, 20 } };

	static void display() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void change() {
		
		System.out.println(Arrays.deepToString(a));
		
	}

	public static void main(String[] args) {

		System.out.println(a.length);

		display();
		change();
		
	
	}
}

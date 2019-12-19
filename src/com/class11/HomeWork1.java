package com.class11;

public class HomeWork1 {
	public static void main(String[] args) {
		/*
		 * Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		 * Miss and Smith, Jordan, Jackson, Obama. After storing values print the
		 * following: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */

		String[][] names = { { "Mrs", "Mr", "Ms", "Miss" }, { "Smith", "Obama", "Jackson", "Jordan" } };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(names[j][i] + " ");// mrs smith mr obama
			}
			System.out.println();
		}

		/*
		 * for (int i = 0; i < names.length-1; i++) { for (int j = 0; j <
		 * names[i].length; j++) { System.out.println(names[i][j]+" "+names[i+1][j]); }
		 * 
		 * }
		 */

	}

}

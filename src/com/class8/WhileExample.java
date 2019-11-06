package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*ask user if its raining boolean
		 * if its raining keep asking
		 * no rain >> go to park
		 */
		Scanner scan=new Scanner(System.in);
		boolean isRain;
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.nextBoolean();
		}while(isRain);
		System.out.println("Go to the park");

	}

}

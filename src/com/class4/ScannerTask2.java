package com.class4;

import java.util.Scanner;

public class ScannerTask2 {
	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to payoff immediately, otherwise you can tell them that they can spend
		 * more.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a credit card? yes/no");
		String credit = scan.next();

		if (credit.equals("yes")) {
			System.out.println("What is balance on the card?");
			int balance = scan.nextInt();
			if (balance > 1000) {
				System.out.println("Pay off immediately");
			} else {
				System.out.println("You are good to spend more");
			}
		} else {
			System.out.println("You can apply for a credit card");
		}

	}
}



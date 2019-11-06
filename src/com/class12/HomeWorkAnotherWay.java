package com.class12;

import java.util.Scanner;

public class HomeWorkAnotherWay {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Create a username and password \nPassword should be "
					+ "minimum 8 characters");
			System.out.print("Username: ");
			String un = sc.nextLine();
			System.out.print("Password: ");
			String pw = sc.nextLine();

			if (un.isEmpty() || pw.isEmpty()) {
				System.err.println("Username or password cannot be empty");
			} else if (pw.length() < 8) {
				System.err.println("Password is too short. Try again");
			} else if (pw.toUpperCase().contains(un.toUpperCase())) {
				System.err.println("Password cannot contain username. Try again!");

			} else {
				while (true) {
					System.out.println("Confirm your password");
					String cp = sc.nextLine();
					if(pw.equalsIgnoreCase(cp)==false) {
						System.err.println("Passwords do not match. Try again!");
					}else {
						System.out.println("Your account has been created\n"
								+ "Username= "+un+"\nPassword= "+pw);
					}
						break;
				}
				
			}
			break;
		}

	}
}

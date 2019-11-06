package com.class12;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following requirements:
			Username and Password cannot be  empty, 
			if so→ message=“c”.
			Password should be minimum 8 characters, 
			if less → message=“Password is too short”.
			Password cannot contain username 
			if so, → message=“Password cannot contain username”.
			Password should match confirmed password, 
			if not  → message=“Passwords do not match”.
			Only after all requirements met 
			→ message “Your username and password has been created”
		 */
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Create a username and password");
		String un=sc.nextLine();
		String pw=sc.nextLine();
		
		System.out.println("Confirm your password");
		String cp=sc.nextLine();
		
		if(un.isEmpty()||pw.isEmpty()) {
			System.err.println("Username or password cannot be empty");
		}else if(pw.length()<8) {
			System.err.println("Password is too short");
		}else if (pw.toUpperCase().contains(un.toUpperCase())) {
			System.err.println("Password cannot contain username");
		}else if(pw.equalsIgnoreCase(cp)==false) {
			System.err.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
	}

}

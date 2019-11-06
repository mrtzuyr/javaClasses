package com.class12;

import java.util.Scanner;

public class HomeWorkMostAccurate {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
    String username, password, password1;
   
    do {
        System.out.print("Please Enter your Username: ");
        username = scan.nextLine();
        if (username.isEmpty()) {
            System.err.println("Username can not be empty !! Try again");
        }
    } while (username.isEmpty());
    
    
    do {
        System.out.print("Please enter your Password: ");
        password = scan.nextLine();
        if (password.length() > 0 && password.length() < 8) {
            System.err.println("Password is too short !! ");
        } else if (password.contains(username)) {
            System.err.println("Password can not contain username !!");
        } else if (password.isEmpty()) {
        	System.err.println("Password can not be empty !! Try again");
        }
    } while (password.length() > 0 && password.length() < 8 || password.contains(username) || password.isEmpty());
    
    
    do {
        System.out.print("Please confirm your password: ");
        password1 = scan.nextLine();
        if (password1.equals(password)) {
            System.out.println("Your account has been created\nUsername: "+username+"\nPassword: "
            		+password);
        } else {
            System.err.println("Your passwords do not match!! Try again.");
        }
    } while (!password1.equals(password));


	}
}
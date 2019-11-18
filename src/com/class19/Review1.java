package com.class19;

import java.util.Scanner;

public class Review1 {
	
	String StateCapital(String userState) {
		
		String capital;
		switch (userState.toLowerCase()) {
		case "arkansas":
			capital="Little Rock";
			break;
		case "new york":
			capital="Albany";
			break;
		case "texas":
			capital="Austin";
			break;
		case "california":
			capital="Sacramento";
			break;
		default:
			capital="unknown";
		}
		return capital;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Review1 obj=new Review1();
		
		Scanner scan=new Scanner(System.in);
		String userState;
		
		do {
			System.out.println("Please enter a state");
			userState=scan.nextLine();
			String capitalCity=obj.StateCapital(userState);
			System.out.println("The capital of "+userState+" is "+capitalCity);
			
		}while(!(userState.equalsIgnoreCase("Arkansas")));
		
		System.out.println("Arkansas is known as natural state. You should definitely visit.");
		
		
		
		
		
	}

}

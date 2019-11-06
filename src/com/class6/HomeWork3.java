package com.class6;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
	/*
	 * Ask user to enter their country and capture it. 
	 * Once values are captured print which language user speaks.
	 * 
	 */
		Scanner scan=new Scanner(System.in);
		String country,language;
		
		System.out.println("What country are you from?");
		country=scan.nextLine();
		
		switch(country) {
		case "Turkey":
			language="Turkish";
			break;
		case "France":
			language="French";
			break;
		case "Italy":
			language="Italian";
			break;
		case "Japan":
			language="Japanese";
			break;
			default:
				language="unknown";
				break;
		}
		System.out.println("You are from "+country+" and you speak "+ language);


		
	}

}

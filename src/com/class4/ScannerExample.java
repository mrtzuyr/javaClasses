package com.class4;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		//Scanner is a class in Java that allows us take an input from user
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		/*nextInt(); for numbers
		 *nextLine(); for strings
		 *nextDouble(); for for double
		 */
		int num=scan.nextInt();
		System.out.println("Entered number is "+num);
		System.out.println("____________________________");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good afternoon "+name);
	}
	

}

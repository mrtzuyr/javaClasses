package com.class7;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		/* You need to ask user to pay for coffee
		* You need to keep asking user to pay for it until
		* entered price is equal =5; 
		* After user paid then say “Enjoy your coffee!”
		*/
		
		Scanner scan=new Scanner(System.in);
		int price;
		
		do {
			System.out.println("Please pay for your coffee");
			price=scan.nextInt();
		}while (price!=5);
			
				System.out.println("Enjoy your coffee");
			
		
	
	}
}

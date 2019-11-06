package com.class8;

import java.util.Scanner;

public class BreakAndContinueTask2 {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	
	
	for(int i=0; i<=10; i++) {
		System.out.println("Would you like to apply for credit card?");
		String answer=scan.nextLine();
		if(answer.equalsIgnoreCase("yes")) {
			break;
		}
		
	}
	
	
}
}

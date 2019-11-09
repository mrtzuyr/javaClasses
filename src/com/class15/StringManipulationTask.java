package com.class15;

import java.util.Scanner;

public class StringManipulationTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String br;
		
		
		do {
			System.out.println("Please enter browser name");
		    br=scan.nextLine();
		}
		while(!(br.toLowerCase().equals("firefox")||br.toLowerCase().equals("chrome")||
				br.toLowerCase().equals("safari")||br.toLowerCase().equals("ie")));
		
			
		
		System.out.println("Execution be performed on "+br);


	}
}

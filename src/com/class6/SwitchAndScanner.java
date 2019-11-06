package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your gender? F/ M");
		char gender=scan.next().charAt(0);
		String userGender;
		
		switch(gender) {
		case 'F':
			userGender="Female";
			break;
		case 'M':
			userGender="Male";
			break;
			default:
				userGender="unknown";
		}
		System.out.println("Your gender is "+userGender);
		
		
		
		
		}
	}



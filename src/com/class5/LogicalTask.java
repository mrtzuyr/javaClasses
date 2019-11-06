package com.class5;

import java.util.Scanner;

public class LogicalTask {
	public static void main(String[] args) {
		int day=9;
		
		if (day>=1 && day<=5) {
			System.out.println("it is a weekday");
			
		}else if (day==6 ||day==7) {
			System.out.println("it is weekend");
		}else {
			System.out.println("invalid day");
			}
		
		System.out.println("********************");
		
		Scanner input=new Scanner(System.in);
		System.out.println("How tall are you?");
		int h=input.nextInt();
		if (h<5) {
			System.out.println("short");
		}else if(h>=5 && h<6) {
			System.out.println("medium");
		
		}else {
			System.out.println("tall");
		}
		
	}

}

package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		
		int n1=102;
		int n2=102;
		
		if(n1>n2) {
			System.out.println("n1 is larger than num2");
		}else if (n1==n2) {
			System.out.println("n1 is equal to n2");
		}else {
			System.out.println("n1 is smaller than n2");
		}
		
		int day=6;
		
		if (day==1) {
			System.out.println("Today is Monday, I have to go to work");
		}else if (day==2) {
			System.out.println("Today is Tuesday, I have SDLC class");
		}else if(day==3) {
			System.out.println("Today is Wednesdary, I have Java review class");
		}else if (day==4) {
			System.out.println("Today is Thursday, I have SDLC review class");
		}else if (day==5) {
			System.out.println("Today is Friday, weekend is here");
		}else if (day==6) {
			System.out.println("Today is Saturday, my favorite coding day");
		}else if (day==7) {
			System.out.println("Today is Sunday, I love spending Sundays");
		}else {
			System.out.println("I do not know this day");
		}


	}

}

package com.class4;

public class NestedIfTask {
	public static void main(String[] args) {
		
		boolean isDiploma=true;
		double gpa=2.5;
		
		if(isDiploma) {
			System.out.println("Congratulations");
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		
		}else {
			System.out.println("Get a degree");
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		
		double rate=4.5;
		int price=210000;
		
		if(rate<4.5) {
			System.out.println("I will buy a house");
			if(price>200000) {
				System.out.println("I will take a loan");
			}else {
				System.out.println("I will pay cash");
			}
	
		}else {
			System.out.println("I will not buy a house");
		}
		
		
	}

}

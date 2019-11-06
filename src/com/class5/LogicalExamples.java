package com.class5;

import java.util.Scanner;

public class LogicalExamples {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount of daily sales");
		double sales=scan.nextDouble();
		double commission;
		
		
		if (sales<100) {
			//give %10 commission of sale
			commission=sales*0.1;
		}else if(sales>=100 && sales<200) {
			//give %20 commission of sale
			commission=sales*0.2;
		}else if(sales>=200 && sales<500) {
			//give %30 commission of sale
			commission=sales*0.3;
		}else if (sales>=500) {
			//give %50 commission of sale
			commission=sales*0.5;
		}else {
			commission=0;
		}
		System.out.println("Based on your sales your commission is "+commission);
	}

}

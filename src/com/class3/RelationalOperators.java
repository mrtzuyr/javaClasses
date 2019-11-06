package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("xxxxxxxxxxxxx");
		
		double d=1.99;
		double d1=2.99;
		boolean b=d>d1;
		System.out.println(b);
		boolean b1=d==d1;
		System.out.println(b1);
		boolean b2=d!=d1;
		System.out.println(b2);
		System.out.println("xxxxxxxxxxxxx");
		
		
		int x=200;
		int y=30;
		if (x>y) {
			System.out.println("x is larger than y");
		}else {
			System.out.println("x is smaller than y");
		}
		
		int expectedHours=15;
		int actualHours=2;
		
		if (actualHours>expectedHours) {
			System.out.println("you will succeed");
		
		}else {
			System.out.println("please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2;
		
		if (teaPrice<=allowedPrice) {
			System.out.println("i will buy tea");
			System.out.println("and i will enjoy my tea");
		}else {
			System.out.println("i will not buy");
		}
		
		boolean val=false;
		if(val) {//if val==true
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		boolean isRain=false;
		if(isRain) {//if isRain==true
			System.out.println("I will take my umbrealla");
		}else {
			System.out.println("I will not take my umbrella");
		}
		
	}
	

}

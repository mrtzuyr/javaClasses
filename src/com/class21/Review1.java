package com.class21;

public class Review1 {
	
	static int a,b,c;
	
	static void sum() {
		a=10;
		b=12;
		c=15;
		System.out.println(a+b+c);
	}
	
	static int sum1() {
		a=10;
		b=12;
		c=15;
		return a+b+c;
	}
	public static void main(String[] args) {
		
		sum();
		System.out.println(sum1());
}
}
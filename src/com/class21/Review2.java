package com.class21;

public class Review2 {
	public static void main(String[] args) {
		
		Review1.sum();
		System.out.println(Review1.sum1());
		
		Review1.a=Review1.b+Review1.c;
		Review1.b=Review1.a-Review1.b;
		Review1.c=Review1.a-Review1.b;
		
		System.out.println(Review1.a);
		System.out.println(Review1.b);
		System.out.println(Review1.c);
	}
}

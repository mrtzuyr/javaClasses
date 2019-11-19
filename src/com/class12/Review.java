package com.class12;

public class Review {
	
	String str="weekend";
	String str1="week";
	String str2="days";
	
	static String day="monday";
	
	static void a(String str) {
		String str1=str.trim();
		System.out.println(str1);
	}
	
	static char b(String str) {
		char a=str.charAt(str.length()-1);
		return a;
	}
	
	public static void main(String[] args) {
		
		Review obj=new Review();
		System.out.println(obj.str.contains(obj.str1));
		System.out.println(obj.str2.toUpperCase());
		
		System.out.println(day.toUpperCase());
		
		System.out.println(day.length());
		System.out.println(obj.str.length());
		
		a("        sunday       ");
		
		String day="weekdays";
		char lastLetter=b(day);
		System.out.println(lastLetter);
		String s=Character.toString(lastLetter);
		System.out.println(day.endsWith(s));
		
		
	}
}

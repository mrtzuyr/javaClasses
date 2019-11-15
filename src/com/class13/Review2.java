package com.class13;

public class Review2 {
	public static void main(String[] args) {
		
		String str="My phone number #501-543-3132";
		
		System.out.println(str.replaceAll("[a-z]",""));
		System.out.println(str.replaceAll("[0-9]",""));
		System.out.println(str.replaceAll("[A-Za-z0-9 ]",""));
		System.out.println(str.replaceAll("[^A-Za-z0-9 ]",""));
		System.out.println(str.replaceAll("[0-9]","*"));
		
		System.out.println("*********************************************");
		
		//"\\w"="[A-Za-z0-9]"
		String str1="The show is gonna start at 10:30";
		System.out.println(str1.replaceAll("\\s","<>"));
		System.out.println(str1.replaceAll("\\w",""));
		System.out.println(str1.replaceAll("[A-Za-z0-9]",""));
		System.out.println(str1.replaceAll("\\W", ""));
	}
}

package com.class14;

public class Task {
	public static void main(String[] args) {
		
		String str="Today is Sunday and I hate sundays";
		
		System.out.println(str.replace(" ",""));
		
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-++-+-+");
		
		String str2=" That is my phone number = #501-541-22 80";
		String str3=str2.replaceAll("[^A-Za-z]", "");
		System.out.println(str3);
		System.out.println(str3.length());
		
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-++-+-+");
		
		
		String str4="Is it Saturday? Is it raining? Do we have a Java class today?";
		String [] str5=str4.split("\\?");
		System.out.println(str5.length);
		
	}

}

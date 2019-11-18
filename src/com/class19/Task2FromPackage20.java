package com.class19;

import com.class20.Task2;

public class Task2FromPackage20 {
	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		String str="merdiven";
		boolean result=obj.palindrome(str);
		System.out.println("Is "+str+" palindrome? "+result);
	}

}

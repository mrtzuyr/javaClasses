package com.class14;

public class Review2 {
	public static void main(String[] args) {
		String str="My mom told me to buy bananas,apples,tomatoes,patatoes.";
		
		String [] array=str.split(",");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("*********************");
		
		String str1="She woke up. She took a shower. She had breakfast. She read the news and left";
		String [] array1=str1.split("\\.",3);
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println("********************");
		
		String [] array2=str1.split("[A-Z]");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		System.out.println("*********************");
		System.out.println(str1.replaceAll("fast(.*)", " "));
		System.out.println(str1.replaceAll("read(.....)",""));
		System.out.println(str1.replaceAll("[^a-zA-Z\\s]", ">"));
	}
}

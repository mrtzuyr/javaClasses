package com.class20;

public class Task2 {
	//Create a method that will take a String and return whether 
	//String is palindrome or not. Method should be available to all classes within your projects.
	//Go to package 19>>Task2FromPackage20
	
	public boolean palindrome(String word) {
		String drow="";
		for (int i =word.length()-1; i >=0 ; i--) {
			drow+=word.charAt(i);
	}
		if (word.equals(drow)) {
			return true;
		}else {
			return false;
		}

	}
	
	/*
	 * Create a method that will take a string and return an array of words from that string. 
	 * Method should be available only within same class.
	 */
	
	private String[] arrayOfWords(String sentence) {
		//String [] stringArray=sentence.split(" ");
		//return stringArray;
		return sentence.split(" ");
	}
	
	public static void main(String[] args) {
		Task2 task=new Task2();
		String[] strArray=task.arrayOfWords("What a beautiful day!");
		for(String word:strArray) {
			System.out.println(word);
		}
	}
}

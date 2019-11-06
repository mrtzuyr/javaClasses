package com.class14;

public class SplitMethod {
	public static void main(String[] args) {
		
		String str="Today is Sunday. It is a sunny day. We are having Java class.";
		
		String [] array= str.split(" ");
				
				for(int i=0; i<array.length; i++) {
					System.out.println(array[i]);
				}
		
				System.out.println("********************************");
		
		String [] array2= str.split("\\.");
		System.out.println(array2.length);
		for (String s : array2) {
			System.out.println(s.trim());
			
		}
	}

}

package com.class14;

public class Review1 {
	public static void main(String[] args) {
		String str="Today is Wednesday and I have not done anything yet";
		
		String [] array =str.split(" ");
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println("*********************");
		
		String reversed="";
		for(int i=array.length-1; i>=0; i--) {
			reversed+=(array[i]+" ");
		}
		System.out.println(reversed);
		
		System.out.println();
		System.out.println("****************");
		
		String a="";
		for (int i =reversed.length()-1; i >=0; i--) {
			a+=(reversed.charAt(i));
		}
		System.out.println(a.trim());
		
		System.out.println();
		System.out.println("******************");
		
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
			
		}
		
		
	}
}

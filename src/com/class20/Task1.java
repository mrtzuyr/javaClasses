package com.class20;

public class Task1 {
	
	    //Create a method that will take 1 parameter as a String and return reversed String. 
		//	Method should be visibly only within same package.
	
	String reversedTask (String r) {
		String r1="";
		for (int i =r.length()-1; i >=0 ; i--) {
			r1+=r.charAt(i);
		}
		return r1;
	}

	public static void main(String[] args) {
		Task1 obj=new Task1();
		System.out.println(obj.reversedTask("king"));
	}
}

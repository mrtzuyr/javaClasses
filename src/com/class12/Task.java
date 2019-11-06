package com.class12;

public class Task {

	public static void main(String[] args) {
		
		
		  // Create two Strings and initialize them with some value.
          // implement the following methods on those strings.
        
        /*
         * sen.length();
         * sen.equals();
         * sen.contains(s);
         * sen.toUpperCase();
         * sen.toLowerCase();
         * sen.equalsIgnoreCase(anotherString);
         */
		
		String s1="It iS weeKEnd";
		String s2="WeEkend";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.toLowerCase().contains(s2.toLowerCase()));

	}

}

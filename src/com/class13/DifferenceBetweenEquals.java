package com.class13;

public class DifferenceBetweenEquals {
	public static void main(String[] args) {
		
		String a ="Hello";
        String b ="Hello";
        
        System.out.println(a.equals(b));
        System.out.println(a==b);
        
        String x = new String ("Bye");
        String y = new String ("Bye");
        
        System.out.println(x.equals(y));
        System.out.println(x==y);
        
        
        /* 	.equals : compares the content 
         * 	(are both of them have the same sequence of char? )
         *   ==   : compares the objects   
         *  (checks if both objects point to the same memory )
         *
         */
	}

}

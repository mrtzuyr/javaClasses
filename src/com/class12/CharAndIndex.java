package com.class12;

public class CharAndIndex {
	public static void main(String[] args) {
		
		/*
         * This method returns the character located at the String’s specified index.
         * The string indexes start from zero.
         */
        String str7="We might be done early today";
        System.out.println(str7.charAt(14));
        
        
        System.out.println("*******************");
        /*
         * This method returns the index within this string of the
         * first occurrence of the specified character or -1
         * if the character does not occur.
         */
        String str8="We might not be done early";
        System.out.println(str8.indexOf('e',12));
        System.out.println(str8.indexOf('z'));
        
	}

}

package com.class12;

public class ConcatAndTrim {
	
	public static void main(String[] args) {
		
		String s="Hello";
		String s1="World ";
		String s2="People";
		
		System.out.println(s+" "+s1);
		System.out.println(s.concat(" "+s1).concat(s2));
		
		//////////////////////
		
		
		String str= "            How are you?          ";
		System.out.println(str.trim());
	}

}

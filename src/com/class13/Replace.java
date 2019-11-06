package com.class13;

public class Replace {
	public static void main(String[] args) {
		
		String str="Hello John, how are you John, how you been?";
		
		System.out.println(str.replace('h', 'y'));
		System.out.println(str.replaceFirst("John", "Tim"));
		
		
		String str1="08-03-1992";
		
		System.out.println(str1.replace("-", "/"));
		

	}

}

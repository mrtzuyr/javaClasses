package com.class13;

public class Review {
	public static void main(String[] args) {
		
		
		
		String str="hello what's up bro";
		System.out.println(str.replace("up", "good"));
		System.out.println(str.replace(" ", "\n"));
		System.out.println(str.replaceFirst("h","y"));
		
		System.out.println("*********************");
		
		//Middle Letter Example
		
		String str1="september";
		
		int middle=str1.length()/2;
		if(!str1.isEmpty()) {
			if(str1.length()%2!=0 && str1.length()>=3) {
				char m=str1.charAt(middle);
				String s=Character.toString(m);
				String k=s.toUpperCase();
				int i=str1.indexOf(m);
				System.out.println(i);
				System.out.println(str1.replace(s,k));
				
			}
		}
		
		
	}

}

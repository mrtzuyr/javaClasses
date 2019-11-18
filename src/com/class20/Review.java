package com.class20;

public class Review {
	
	public String reversedTask (String r) {
		String r1="";
		for (int i =r.length()-1; i >=0 ; i--) {
			r1+=r.charAt(i);
		}
		return r1;
	}
	
	boolean isPalindrome(String word) {
		Review obj=new Review();
		String result=obj.reversedTask(word);
		if(result.equalsIgnoreCase(word)) {
			return true;
		}else {
		return false;
		}
	}
	public static void main(String[] args) {
		Review obj=new Review();
		String wordd="Kayak";
		boolean palind=obj.isPalindrome(wordd);
		System.out.println("Is "+wordd+" palindrame?: "+palind);
	}

}

package com.class13;

public class TaskReverseAndMiddle { 
	public static void main(String[] args) {
		String str="step on no pets";
		
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		
		String s="murTaza";
		int middle=s.length()/2;
		if(!s.isEmpty()) {
			if(s.length()%2!=0 && s.length()>=3) {
				System.out.println(s.charAt(middle));
				
			}
		}		
	}

}

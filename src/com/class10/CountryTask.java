package com.class10;

public class CountryTask {
	public static void main(String[] args) {
		
		String[] c= {"Turkey","France","Lebanon","Italy"};
		
		for(int i=0; i<c.length; i++) {
			if(c[i].equals("Turkey")) {
				System.out.println(c[i]+" Ankara");
			}else if(c[i].equals("France")) {
				System.out.println(c[i]+" Paris");
			}else if(c[i].equals("Lebanon")) {
				System.out.println(c[i]+" Beirut");
			}else {
				System.out.println(c[i]+" Rome");
			}
		}
	}

}

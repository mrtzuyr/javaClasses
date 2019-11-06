package com.class8;

public class BreakAndContinue {
	public static void main(String[] args) {
		for (int i=0; i<=10; i++) {
			if(i==10) {
				break;
			}
			System.out.println(i);
		}
		
		
		for(int i=1; i<=5; i++) {
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		
		
		//numbers 1-20 except 5,6,7
		
		for(int i=1; i<=20; i++) {
			if(i==5 || i==6 || i==7) {
				continue;
			}
		System.out.println(i);
	}
		
		for(int i=1; i<=20; i++) {
			if(i>=3 && i<=17) {
				continue;
			}
		System.out.println(i);
		}	
		
		
	}

}

package com.class7;

public class WhileLoopTask {

	public static void main(String[] args) {
		
		 //print only odd numbers from 50 to 100
		int a=50;
		while(a<100) {
			
			if(!(a%2==0)) {
				System.out.println(a);
			}
			a++;
		}
		System.out.println("**************************");
		
		// print only even numbers from 100 to 1
		
		int b=100;
		while(b>1) {
			if(b%2==0) {
				System.out.println(b);
			}
			b--;
		}

	}

}

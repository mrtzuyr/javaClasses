package com.class18;

public class TaskParameter {
	
		void larger(int a, int b) {
			if(a>b) {
				System.out.println(a+" is larger than "+b);
			}else if(a==b) {
				System.out.println("Numbers are equal");
			}else {
				System.out.println(b+" is larger than "+a);
			}
			
		}
		
		void evenOdd(int c) {
			if(c%2==0) {
				System.out.println(c+" is an even number");
			}else
				System.out.println(c+" is an odd number");
		}
		
		void palindrome(String d) {
			String e= "";
			for (int i =d.length()-1; i>=0; i--) {
				e=e+d.charAt(i);
			}
			if (d.equalsIgnoreCase(e)){
				System.out.println(d+ " is a palindrome word");
			}else {
				System.out.println(d+ " is not a palindrome word");
			}
		}
		
		public static void main(String[] args) {
			TaskParameter number=new TaskParameter();
			number.larger(12, 12);
			number.evenOdd(3);
			number.palindrome("Radar");
		}
	}



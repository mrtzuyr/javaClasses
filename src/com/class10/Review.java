package com.class10;

public class Review {
	
	static String [] day= new String[3];
	
	static int [] number=new int[4];
	
	static void display(String [] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	     //overloading ;) 
		static void display(int[] num) {
			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}
		}
	
	
	public static void main(String[] args) {
		
		day[0] ="Monday";
		day[1]="Tuesday";
		day[2]="Wednesday";
		
		display(day);
		
		number[0]=12;
		number[1]=13;
		number[2]=14;
		number[3]=15;
		
		display(number);
	}

}

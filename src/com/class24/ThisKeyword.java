package com.class24;

public class ThisKeyword {
	
	int a,b;
	public ThisKeyword() {
		// TODO Auto-generated constructor stub
	}
	
	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void sum(int a , int b) {
		System.out.println("Sum of the local parameters is "+(a+b));
		System.out.println("Sum of the instance variables is "+(this.a+this.b));
	}
	
	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword(20 ,10);
		obj.sum(35, 15);
	}

}

package com.class31;

public class MarksTest {
	public static void main(String[] args) {
		
		Marks studentA=new StudentA(60,70,80);
		System.out.println(studentA.getPercentage());
		
		Marks studentB=new StudentB(45,90,50,67);
		System.out.println(studentB.getPercentage());
	}

}

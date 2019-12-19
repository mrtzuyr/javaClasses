package com.class5;

public class Review {
	public static void main(String[] args) {
		
		//checking if we need &&
		//if you write your code from greater to less you won't need &&
		
	int score=75;
	char gr;
	
	if (score>=85) {
		gr='A';
	}else if (score>=70) {
		gr='B';
	}else if (score>=55) {
		gr='C';
	}else if (score>=35) {
		gr='D';
	}else {
		gr='F';
	}

			System.out.println(gr);	
		
		
	}
}
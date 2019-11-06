package com.class6;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What month were you born?");
		String month=scan.next();
		String season;
		if(month.equals("january")||month.equals("february")||month.equals("december")) {
			season="winter";
		}else if(month.equals("march")||month.equals("april")||month.equals("may")) {
			season="spring";
		}else if(month.equals("jun")||month.equals("july")||month.equals("august")) {
			season="summer";
		}else if(month.equals("september")||month.equals("november")||month.equals("october")) {
			season="fall";
		}else {
			season=" ";
		}
		System.out.println("You were born in "+season);
	}

}

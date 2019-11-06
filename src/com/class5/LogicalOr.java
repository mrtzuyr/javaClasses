package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
		//7 days a week
		//if day is 2 or 4 -->sdlc class
		//if day is 6 or 7 -->java class
		//if day is 1 or 5 -->no class
		//if day =3 -->review class
		
		int day=6;
		
		if(day==2 || day==4) {
			System.out.println("sdlc class");
		}else if(day==6 || day==7) {
			System.out.println("java class");
		}else if(day==1||day==5) {
			System.out.println("no class");
		}else if(day==3) {
			System.out.println("review class");
		}else {
			System.out.println("not a valid day");
		}
		
		System.out.println("**********************");
		
		String day1="WEDNESDAY";
		
		if(day1.equalsIgnoreCase("tuesday")||day1.equalsIgnoreCase("thursday")){
			System.out.println("sdlc class");
		}else if(day1.equalsIgnoreCase("saturday") || day1.equalsIgnoreCase("sunday")) {
			System.out.println("java class");
		}else if(day1.equalsIgnoreCase("monday") || day1.equalsIgnoreCase("friday")) {
			System.out.println("no class");
		}else if(day1.equalsIgnoreCase("wednesday")) {
			System.out.println("review class");
		}else {
			System.out.println("not a valid day");
		}
			
		
	}

}

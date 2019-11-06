package com.class7;

public class WhileLoopTask2 {

	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		while(workDay) {
				System.out.println("I need a day off");
				
		if(day==6) {
			
			System.out.println("I do not a day off anymore");
			break;
		}
				
		day++;
		
		}
		
		

	}

}

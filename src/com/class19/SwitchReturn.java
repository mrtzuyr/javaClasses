package com.class19;

public class SwitchReturn {
	
	String weekDayName (int weekDay) {
		String weekDayName;
		switch(weekDay) {
		case 1:
			weekDayName="Monday";
			break;
		case 2:
			weekDayName = "Tuesday";
			break;
		case 3:
			weekDayName= "Wednesday";
			break;
		case 4:
			weekDayName= "Thursday";
			break;
		case 5:
			weekDayName= "Friday";
			break;
		case 6:
			weekDayName = "Saturday";
			break;
		case 7:
			weekDayName = "Sunday";
			break;
		default:
			weekDayName = "invalid";
	}
		return weekDayName;
	}
	
	public static void main(String[] args) {
		SwitchReturn obj=new SwitchReturn();
		String day=obj.weekDayName(5);
		System.out.println("Today is "+day);
		if (day.contentEquals("Monday")||day.contentEquals("Friday")) {
			System.out.println("There is no class today");
		}
	}
}

package com.class25;

public class TestEmployee {
	public static void main(String[] args) {
		
	
	
	Developer dev=new Developer();
	Developer.companyName="Syntax";
	dev.salary=110000;
	dev.work();
	dev.getPaid();
	dev.code();
	dev.ceremonies="Sprint Demo, Planning, Retro, Daily Standup";
	dev.attendScrumMeetings();
	
	
	Tester test=new Tester();
	test.salary=90000;
	test.work();
	test.getPaid();
	test.attendScrumMeetings();
	test.test();
	//test.employeeSSN=12345;
	//its not visible because its private
	}
}

package com.class30;

public class DrivableTest {
	
	public static void main(String[] args) {
		
		Drivable obj=new Toyota();
		obj.drive();
		//Drivable.DRIVE_FAST=false;  (ce) final methods cannot be assigned
		Toyota toyota=new Toyota();
		toyota.drive();
		toyota.stop();
	}
}

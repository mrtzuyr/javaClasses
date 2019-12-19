package com.class28;

public class Device {
	
	String deviceType, name;
	
	Device(){}
	public Device(String deviceType, String name) {
		this.deviceType=deviceType;
		this.name=name;
		
	}
	
	int i=120;
}
	class Apple extends Device{
		
	public Apple(String str, String str1) {
		super(str,str1);
		
	}
	int i=150;
}

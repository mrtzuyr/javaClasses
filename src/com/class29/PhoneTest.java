package com.class29;

public class PhoneTest {
	public static void main(String[] args) {
		//You can not directly create an object of abstract class
		
		Phone obj=new Iphone();
		
		obj.sendText();
		obj.makeCall();
		obj.takePicture();
		obj.playGames();
		
		
	}

}

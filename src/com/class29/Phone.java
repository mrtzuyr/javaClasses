package com.class29;

public abstract class Phone {
	
	void sendText() {
		System.out.println("Send text");
	}
	
	void makeCall() {
		System.out.println("Make call");
	}
	
	//abstract void takePicture() {};
	//compile error
	
	abstract void takePicture();
	abstract void playGames();


}

class Iphone extends Phone{

	@Override
	void takePicture() {
		System.out.println("Iphone takes pics");
		
	}

	@Override
	void playGames() {
		System.out.println("Play games on Iphone");
		
	}
	
}

class Samsung extends Phone{

	@Override
	void takePicture() {
		System.out.println("Samsung take pics");
		
	}

	@Override
	void playGames() {
		System.out.println("Play games on Samsung");
		
	}
}
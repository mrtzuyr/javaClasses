package com.class17;

public class Computer {
	
	String brand, name;
	boolean keyboard, mouse;
	int memory, ram, screen;
	
	//define behavior, actions;
	
	void playGames() {
		System.out.println("I can play on my "+name);
	}
	
	void watchMovies() {
		System.out.println("I can watch movies on my "+name);
	}
	
	void javaCoding( ) {
		System.out.println("I can do Java coding on my "+name);
	}
	
	public static void main(String[] args) {
		//using main method for code execution
		Computer com1=new Computer();
		com1.brand="Apple";
		com1.name="Macbook";
		
		System.out.println("I have an "+com1.brand+" "+com1.name);
		com1.javaCoding();
	}

}

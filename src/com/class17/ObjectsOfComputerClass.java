package com.class17;

public class ObjectsOfComputerClass {
	public static void main(String[] args) {
		
		Computer com1=new Computer();
		com1.brand="Apple";
		com1.name="MacBook Pro";
		com1.keyboard=true;
		com1.mouse=false;
		com1.memory=250;
		com1.ram=16;
		com1.screen=16;
		
		Computer com2=new Computer();
		com2.brand="Asus";
		com2.name="Vivobook";
		com2.keyboard=true;
		com2.mouse=true;
		com2.memory=1250;
		com2.ram=8;
		com2.screen=16;
		
		System.out.println("I have a "+com2.brand+" "+com2.name);
		com2.playGames();
		com2.watchMovies();
		com2.javaCoding();
		
	}

}

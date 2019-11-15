package com.class17;

public class ObjectOfCarClass {
	public static void main(String[] args) {
		//ClassName variable=new ClassName();
		//Scanner scan=new Scanner(System.in);
		//String str=new String();
		
		Car car1=new Car();
		car1.make="Hyundai";
		car1.model="Veloster";
		car1.color="Blue";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=180;
		car1.start();
		car1.accelerate();
		car1.drive();
		
		System.out.println("----------");
		
		Car car2=new Car();
		car2.make="Honda";
		car2.model="Insight";
		car2.color="Silver";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=200;
		car2.start();
		car2.accelerate();
		car2.drive();
		
		
		System.out.println("*************************************************8");
		//print features
		//I have a blue Hyundai
		
		System.out.println("I have a "+car1.color+" "+car1.make);
		System.out.println("I have a "+car2.make+" "+car2.year);
	}

}

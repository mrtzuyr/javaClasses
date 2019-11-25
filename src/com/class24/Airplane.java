package com.class24;

public class Airplane {
	public static void main(String[] args) {
		
		ClassA a=new ClassA();
		ClassB b=new ClassB();
		ClassC c=new ClassC();
		
		System.out.println(a.hasSeats);
		System.out.println(ClassA.company);
		a.mag();
		a.pilot();
		
		System.out.println(b.hasFood);
		int nums=b.number=35;
		System.out.println("There are "+nums+" passengers");
		System.out.println(b.hasPillows);
		
		System.out.println(ClassC.company);
		c.windows();
		
	}
}

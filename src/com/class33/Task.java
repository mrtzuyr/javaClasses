package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {
		
		
		ArrayList<String> car=new ArrayList<>();
		
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
	
		for(int i=0; i<car.size();i++) {
			System.out.println(car.get(i));
		}
		
		for(String cars:car) {
			System.out.println(cars);
		}
		
		Iterator<String>it=car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}

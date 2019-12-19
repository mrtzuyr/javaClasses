package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		//create drinks, if a drink contains letter "a" or "e" replace with "water"
		
		List<String>drink=new ArrayList<>();
	drink.add("cola");
	drink.add("tea");
	drink.add("cofee");
	drink.add("juice");
	
	drink.set(0, "water");
	System.out.println(drink);
	
	for(int i=0; i<drink.size();i++) {
		if(drink.get(i).contains("a")||drink.get(i).contains("e")) {
			drink.set(i, "water");
		}
	}System.out.println(drink);
	
	}
}

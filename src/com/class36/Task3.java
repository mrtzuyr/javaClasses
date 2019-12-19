package com.class36;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		/*
		 * Create the collection that will store single uniques 
		 * Objects of a String type in which order is preserved.
		 * Write a logic to concatenate all string from the collection.
		 */
		
		List<String>coll=new ArrayList<>();
		
		coll.add("Monday");
		coll.add("Tuesday");
		coll.add("Wednesday");
		coll.add("Thursday");
		coll.add("Friday");
		String cc="";
		for(int i=0; i<coll.size(); i++) {
			cc+=coll.get(i)+" ";
		}
		System.out.println(cc);
		
	}
}

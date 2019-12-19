package com.class35;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {
	public static void main(String[] args) {
		/* Create a Set collection in which you need to add names of the countries. 
		 * In this set we want all objects to be sorted in alphabetical order. 
		 * Using 2 different ways retrieve all elements from set.
		 */
		
		Set <String>list=new TreeSet<>();
		
		list.add("Canada");
		list.add("Sweden");
		list.add("Finland");
		list.add("Norway");
		list.add("Japan");
		list.add("South Korea");
		
		
		System.out.println("----First Way------");
		Iterator<String>it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----Second Way------");
		for(String element:list) {
			System.out.println(element);
		}
	}
}

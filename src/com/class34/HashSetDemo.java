package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
	
		HashSet<String> hset=new HashSet<>();
		
		hset.add("cucumber");
		hset.add("onion");
		hset.add("carrot");
		hset.add("patato");
		hset.add("cucumber");
		
		System.out.println(hset.size());
		System.out.println(hset);
		//System.out.println(hset.get(2));
		
		
		//Stores elements randomly
		//No method to retrieve elements
		//Iterator and enhanced for loop to retrieve values
		
		Iterator<String> it=hset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String el:hset) {
			System.out.println(el);
		}
		
	}
}

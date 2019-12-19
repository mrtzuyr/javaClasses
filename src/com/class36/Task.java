package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task {
	public static void main(String[] args) {
		/*
		 * Create a Map from array of cities that will sort keys in alphabetical order. 
		 * As a key store the name of the city and as a value store the length of the city 
		 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
		 * If any city name is more than 7 characters remove that city ( use Iterator ).
		 */
		
		String[]cities= {"Austin", "Dallas", "New York", "Fayetville", "Houston"};
		Map <String, Integer>city=new TreeMap<>();
		for(int i=0; i<cities.length;i++) {
		city.put(cities[i], cities[i].length());
		}
		
		//System.out.println(city);
		//Set<Entry<String, Integer>>entry=city.entrySet();
				
		Iterator<Entry<String, Integer>>it=city.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> str=it.next();
			if(str.getValue()>7 ) {
				it.remove();
			}
		}
		System.out.println(city);
		
		
		
	}
}

package com.class35;

import java.util.*;


public class RetrieveAllKeys {

	public static void main(String[] args) {
		//Create a map of a person(name,lastName, address, city, state)

		Map<String, String> personMap=new HashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		//how to retrieve a specific value?
		String value=personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all keys and all values?
		System.out.println("-----Printing all keys-------------");
		Set<String> keys=personMap.keySet();
		
		for(String key: keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			String str=keysIterator.next();
			System.out.println(str+":"+personMap.get(str));
			
		}

		//how can I retrieve and print values key:value
		
		
	}
}
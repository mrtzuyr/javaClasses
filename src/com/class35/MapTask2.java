package com.class35;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTask2 {
	public static void main(String[] args) {
		
		Map <String , String> myMap= new TreeMap<>();
		myMap.put("Sweden","Stockholm");
		myMap.put("German", "Berlin");
		myMap.put("France", "Paris");
		myMap.put("Japan", "Tokyo");
		myMap.put("Italy", "Rome");
		
		Set<String>keys=myMap.keySet();
		
		System.out.println("=====using for each loop=====");
		for(String k:keys) {
			System.out.println(k+":"+myMap.get(k));
		}
		
		System.out.println("=====using iterator======");
		Iterator<String>it=keys.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str+":"+myMap.get(str));
		}


}
}
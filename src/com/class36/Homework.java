package com.class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework {
	public static void main(String[] args) {
		/*Create a map of Best Buy store. Place
		  item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		  Retrieve all keys and values from a Best Buy map using EntrySet.
		  */
		
		
		Map <Integer, String>bb=new HashMap<>();
		
		bb.put(3243, "TV");
		bb.put(4356, "Cellphone");
		bb.put(65765, "Smartwatch");
		bb.put(87687, "Tablet");
		bb.put(7686, "Fridge");
		
		Set<Entry<Integer, String>> eSet=bb.entrySet();
		
		System.out.println("-----using for each-----");
		
		for(Entry<Integer, String>all:eSet) {
			//System.out.println(all);
			System.out.println(all.getKey()+"-> "+all.getValue());
		}
		
		System.out.println("-----using iterator-----");
		
		Iterator<Entry<Integer, String>>it=eSet.iterator();
		while(it.hasNext()) {
			Entry<Integer, String>ite=it.next();
			//System.out.println(ite);
			System.out.println(ite.getKey()+" --> "+ite.getValue());
		}
		
	}
}

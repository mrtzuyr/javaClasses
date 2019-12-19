package com.class35;

import java.util.*;

public class MapTask {
	public static void main(String[] args) {
		
		Map<Integer, String>building=new TreeMap<>();
		
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Apple");
		building.put(4, "Dunder Mifflin");
		building.put(5, "Vance Refrigeration");
		building.put(6, "Dunder Mifflin");
		building.put(3, "Michael Scott Paper Company");
		building.put(7, "Syntax");
		System.out.println(building);
		
		building.replace(4, "Dwight Schrute's Gym For Muscles");
		building.remove(1);
		
		System.out.println(building);
		
		
	}
}

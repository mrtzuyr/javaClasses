package com.class32;

import java.util.ArrayList;

public class ArrayListTask {
	public static void main(String[] args) {
		
		ArrayList<String>myList= new ArrayList<>();
		
		myList.add("Ali");
		myList.add("Veli");
		myList.add("Kirk");
		myList.add("Dokuz");
		myList.add("Elli");
		
		System.out.println(myList.isEmpty());
		System.out.println(myList.contains("Veli"));
		System.out.println(myList.size());
		
		
		for(String list:myList) {
			System.out.println(list);
		}
		
		//Array list can be generic and non-generic
		
	}
}

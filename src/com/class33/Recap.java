package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	public static void main(String[] args) {
		
		//How to create ArrayList
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size=numbers.size();
		System.out.println(size);
		
		numbers.remove(2);
		System.out.println(numbers);
		
		//retrieve value from ArrayList
		int element=numbers.get(0);
		System.out.println(element);
		
		//1.for loop
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));	
		}
		
		//2.enhanced loop
		for(int num:numbers) {
			System.out.println(num);
		}
		
		//backwards
		for(int i=numbers.size()-1; i>=0; i--) {
			System.out.println(numbers.get(i));
		}
		
		//iterator
		
		Iterator<Integer>it=numbers.iterator();
		
		while (it.hasNext()) {
            System.out.println(it.next()); 
		}
	}
}

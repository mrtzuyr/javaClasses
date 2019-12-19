package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	public static void main(String[] args) {
		
		//remove the words that ends with "e"
		
		ArrayList<String>list=new ArrayList<>();
		
			list.add("cute");
			list.add("love");
			list.add("hello");
			list.add("java");
			
			Iterator<String>it =list.iterator();
			
			while(it.hasNext()) {
				if(it.next().endsWith("e")) {
					it.remove();
					break;
				}
			}
			System.out.println(list);
		
		
	}
}

package com.class35;

import java.util.*;

public class Homework2 {
	public static void main(String[] args) {
		/*	Create a Set of cities in which you want to make sure that insertion order is maintained.
		 *  Using Iterator remove any city that starts with “A”;
		 */
		
		Set <String>list=new LinkedHashSet<>();
		
		list.add("New York");
		list.add("Atlanta");
		list.add("Dallas");
		list.add("Albany");
		list.add("Houston");
		
		Iterator <String >it=list.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith("A")) {
				it.remove();
				
			}
			
		}
		
		System.out.println(list);
	}
}

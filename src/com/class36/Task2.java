package com.class36;

import java.util.*;
import java.util.Map.Entry;


public class Task2 {
	/*
	 * Create a Map that will store Employee name and salary. 
	 * Write a logic to retrieve an employee who gets the highest salary.
	 * Output should be in the below format
     * John Smith=$100000
	 */
	public static void main(String[] args) {
		Map<String, Integer>emp=new HashMap<>();
		
		emp.put("John",3400);
		emp.put("Jim",4400);
		emp.put("Michael",8300);
		emp.put("Pam",2300);
		emp.put("Phylis",5800);
		
		//Set<Entry<String, Integer>>entry=emp.entrySet();
		int max=0;
		for(Entry<String, Integer> el:emp.entrySet()) {
			if(el.getValue()>max) {
				max=el.getValue();
			}
			
		}
		Set<String>set=emp.keySet();
		for(String el:set) {
			if(emp.get(el)==max) {
				System.out.println(el+"=$"+max);
			}
		}
		
	}
}

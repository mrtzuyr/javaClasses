package com.class36;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		
		/*
		 * Create a collection of integers in which you can keep duplicates. 
		 * Write a logic to find sum of all integers
		 */
		
		List<Integer>nums=new ArrayList<>();
		
		nums.add(12);
		nums.add(23);
		nums.add(4);
		nums.add(11);
		
		int sum=0;
		for(Integer e:nums) {
			sum+=e;
			
		}
		System.out.println(sum);
		
	}
}

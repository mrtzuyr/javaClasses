package com.class32;

import java.util.ArrayList;

public class NonGeneric {
	public static void main(String[] args) {
		
		ArrayList myList=new ArrayList();
		
		myList.add("John");
		myList.add(12);
		myList.add('A');
		
		System.out.println(myList);
		
		
		
		ArrayList <Object> list=new ArrayList<>();
		list.add(24);
		list.add("coool");
		list.add(12.33);
		
		System.out.println(list);
	}
}

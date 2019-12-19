package com.class27;

public class ExamplesTest {
	public static void main(String[] args) {
		
	
	Examples obj=new smallExample();
	String result=obj.hello("John");
	System.out.println(result);
	
	String result1=obj.hello("john",13, "jack");
	System.out.println(result1);
	
	}
}

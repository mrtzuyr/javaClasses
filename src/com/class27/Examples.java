package com.class27;

public class Examples {
	
	public String hello(String str) {
		return str;
	}
	
	public void hello(String str, int num) {
		System.out.println(str+" "+num);
	}
	public String hello(String str, int num, String str1) {
		return str+" "+num+" "+str1;
	}
	
	
}

class smallExample extends Examples{
	
	public String hello(String str) {
		return "Hello "+str;
	}
	
}

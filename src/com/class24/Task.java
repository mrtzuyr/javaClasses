package com.class24;

public class Task {
	
	Task (){}
	
	private Task(String a) {
		System.out.println("private constructor");
	}
	
	public Task(int a) {
		System.out.println("public constructor");
		
	//	static Task (String b,int a) {
		// constructors cannot be static...	
		
		}
	
	
	
	public static void main(String[] args) {
		
		Task obj=new Task("test");
		
		
	}
}

package com.class27;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Review {
	
	static String str;
	Review(){
		System.out.print("call me");
	}
	Review(String str){
		this();
		System.out.println(" please");
	}
	
	static void test() {
		System.out.println("You got it.");
	}
	
	void test(String str) {
		this.str=str;
		System.out.println("You got it "+str );
	}
	
	
	
	////////////////////////////////////////////////
	public static void main(String[] args) {
		
		Review obj=new Review("call");
		obj.test("John");
		System.out.println(str);
	}
}
	////////////////////////////////////////////////



	class Test extends Review{
	//static method cannot be overridden but it can be re-assigned	
	static void test() {
		System.out.println("oh ok");
	}
	
}



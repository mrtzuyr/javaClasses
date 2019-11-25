package com.class25;

public class PrivateOverloading {
	
	private void a() {
		System.out.println("This is a private method without any parameters.");
	}
	
	private void a(String str, String str1 ) {
		System.out.println("This is a private method with 2 string parameters ->> "+str+" and "+str1);
	}
	
	private void a(String str, int num) {
		System.out.println("This is a private method with 1 string and 1 integer parameter ->> "+str+" and "+num);
	}
	
	public static void main(String[] args) {
		
		PrivateOverloading obj=new PrivateOverloading();
		//not visible to other classes because they are private methods
		obj.a();
		obj.a("haha","what");
		obj.a("wow", 9);
	}
}

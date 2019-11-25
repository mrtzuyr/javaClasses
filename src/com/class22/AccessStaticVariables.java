package com.class22;

public class AccessStaticVariables {
	public static void main(String[] args) {
		
		Husky obj =new Husky();
		System.out.println(obj.name);
		
		Husky.breed="New Breed";
		
		System.out.println(Husky.breed);
		System.out.println(obj.breed);//possible but not preferable	
		
		
	}
}

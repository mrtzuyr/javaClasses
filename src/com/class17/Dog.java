package com.class17;

public class Dog {
	
	String breed;
	int life; 
	
	
	void catFriendly() {
		System.out.println(breed+" is cat friendly");
	}
	
	void childFriendly() {
		System.out.println(breed+" is child friendly");
	}
	
	void playfulness( ) {
		System.out.println(breed+" is playful");
	}
	

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		dog1.breed="Husky";
		dog1.life=15;
		
		System.out.println(dog1.breed+"'s life expectancy is "+dog1.life+" years");
		dog1.catFriendly();
		dog1.childFriendly();
		dog1.playfulness();
		
		System.out.println("**********************");
		
		Dog dog2=new Dog();
		
		dog2.breed="Golden Retriever";
		dog2.life=12;
		
		System.out.println(dog2.breed+"'s life expectancy is "+dog2.life+" years");
		dog2.catFriendly();
		dog2.childFriendly();
		dog2.playfulness();
		
		System.out.println("************************");
		
		Dog dog3=new Dog();
		
		dog3.breed="German Sheperd";
		dog3.life=13;
		
		System.out.println(dog3.breed+"'s life expectancy is "+dog3.life+" years");
		dog3.childFriendly();
	}
}

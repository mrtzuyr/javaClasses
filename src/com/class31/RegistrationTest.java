package com.class31;

public class RegistrationTest {
	public static void main(String[] args) {
		
	
	Registration user1=new Registration();
	
	user1.setEmail("aali@gmail.com");
	user1.setUserName("Murtaza");
	user1.setPw("123456a");
	
	System.out.println(user1.getEmail());
	System.out.println(user1.getUserName());
	System.out.println(user1.getPw());
	}
}
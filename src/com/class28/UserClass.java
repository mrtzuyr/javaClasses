package com.class28;

public class UserClass {
/* Write program: userClass  that has a constructor that initializes name and 
 * mobile number instance variables. 
 * Create a subclass  userInfo that will have user address variable and 
 * it also being initialized through constructor call. 
 * Print users name, mobile number and address in userDetails method. Test your code.
 */
	
	String name;
	int pNumber;
	
	UserClass(){}
	public UserClass(String name, int pNumber) {
		this.name=name;
		this.pNumber=pNumber;
	}
	
	public static void main(String[] args) {
		UserInfo user=new UserInfo("John",501324443,"101 Coding Dr");
		
		user.userDetails();
		
	}
}
	



	class UserInfo extends UserClass{
		
		String address;
		
		public UserInfo(String name, int pNumber, String address) {
			super(name, pNumber);
			this.address=address;
		}
		
		void userDetails() {
			System.out.println(name+" "+pNumber+" "+address);
		}
	}
	
	


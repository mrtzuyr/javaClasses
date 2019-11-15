package com.class17;

public class Phone {
	
	String brand, name, os;
	int cam, memory;
	
	
	void faceRec() {
		System.out.println("There is face recognition on "+name+" "+brand);
	}
	
	void touch() {
		System.out.println("There is touch id on "+name+" "+brand);
	}

	
	public static void main(String[] args) {
		Phone phone1=new Phone();
		phone1.brand="Apple";
		phone1.name="Iphone";
		phone1.cam=8;
		phone1.memory=64;
		phone1.os="IOS";
		System.out.println("I have "+phone1.name+" "+phone1.brand+". The operating system in my phone is "
				+phone1.os);
		phone1.faceRec();
		phone1.touch();
		
		System.out.println("****************");
		
		Phone p2=new Phone();
		p2.brand="Samsung";
		p2.name="Galaxy";
		p2.cam=12;
		p2.memory=128;
		p2.os="Android";
		System.out.println("I have "+p2.name+" "+p2.brand+". The operating system in my phone is "
				+p2.os);
		p2.faceRec();
		p2.touch();
	}
}

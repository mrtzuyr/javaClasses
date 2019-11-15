package com.class18;

public class Recap {
	String name, address, website;
	int students, teachers, classRooms;
	
	void study() {
		System.out.println("Students are studying at "+name);
	}
	void teach() {
		System.out.println("Teachers are teaching at "+name);
	}
	
	public static void main(String[] args) {
		Recap school=new Recap();
		school.name="Syntax";
		school.students=200;
		
		Recap school2=new Recap();
		school2.name="Pinnacle";
		school2.students=150;
		
		school2.teach();
		school.study();
	}

}

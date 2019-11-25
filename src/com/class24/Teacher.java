package com.class24;

public class Teacher {
	
	
	
	void display(	String name, String lastName, String major, int experience, int salary) {
		System.out.println(name+" "+lastName+" is a "+major+" teacher.\nThis teacher has been teaching for "+experience+
				" years and makes $"+salary+" annualy.");
	}
	
	void love () {
		System.out.println("This teacher is loved by students.");
	}
	
	void yells() {
		System.out.println("This teacher yells a lot.");
	}
	
	void works () {
		System.out.println("This teacher works very hard.");
	}
	
	
	
	public static void main(String[] args) {
		
		MathTeacher math=new MathTeacher();
		ChemistryTeacher che=new ChemistryTeacher();
		PianoTeacher pio=new PianoTeacher();
		
		math.display("Jessica","White","Math", 12, 55000);
		math.math();
		math.love();
		
		System.out.println();
		System.out.println("~~~~~~~~");
		
		che.display("Glen", "Tucker", "Chemistry", 8, 42000);
		che.chemistry();
		che.yells();
		
		System.out.println();
		System.out.println("~~~~~~~~");
		
		pio.display("Veronica", "Walter", "Piano", 18, 64000);
		pio.piano();
		pio.works();
	}
}

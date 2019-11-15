package com.class17;

public class Review {
	String state, capital;
	int senator, population, statePark;
	
	void isDemocrat() {
		System.out.println(state+" is a democrat state.");
	}
	
	void isRebublican() {
		System.out.println(state+" is a republican state");
	}
	
	void isLegal() {
		System.out.println("Smoking in public is legal in "+state);
	}
	
	void isIllegal() {
		System.out.println("Smoking in public is illegal in "+state);
	}
	
	public static void main(String[] args) {
	
		Review states=new Review();
	
	states.state="Arkansas";
	states.capital="Little Rock";
	states.senator=3;
	states.population=5000000;
	states.statePark=14;
	System.out.println(states.state+" is a natural state. The capital is "+states.capital+". There are "+
	states.senator+" senators in "+states.state+".\nThe population is "+states.population+". There are "+
			states.statePark+" state parks in "+states.state);
	states.isDemocrat();
	states.isIllegal();
	System.out.println("************************************");
	
	Review states2=new Review();
	
	states2.state="New York";
	states2.capital="Albany";
	states2.senator=5;
	states2.population=15000000;
	states2.statePark=8;
	System.out.println(states2.state+" is a very crowded state. The capital is "+states2.capital+". There are "+
	states2.senator+" senators in "+states2.state+".\nThe population is "+states2.population+". There are "+
	states2.statePark+" state parks in "+states2.state);
	states2.isRebublican();
	states2.isLegal();
	System.out.println("************************************");
	
	Review states3=new Review();
	
	states3.state="Texas";
	states3.capital="Austin";
	states3.senator=4;
	states3.population=10000000;
	System.out.println(states3.state+" is a business state. The capital is "+states3.capital+". There are "+
	states3.senator+" senators in "+states3.state+". The population is "+states3.population);
	states3.isDemocrat();
	states3.isIllegal();
	System.out.println("************************************");
}
}

package com.class21;

public class Forest {
	public static void main(String[] args) {
		
		//Create four classes: Forest, Wolf, Fox, Bear
	    //Class wolf has: color, age, numberOfWolves
	    //Class fox has: color, speed, numberOfFoxes
	    //Class bear has: type, weight, numberOfBears
	    
	    //Forest has main method
	    //Create different objects/instances of different classes
	    //At the end, print the total for each animal.
		
		Wolf w1=new Wolf();
		w1.color="black";
		w1.age=4;
		Wolf.numberOfWolves++;
		
		Wolf w2=new Wolf();
		w2.color="gray";
		w2.age=3;
		Wolf.numberOfWolves++;
		
		Wolf w3=new Wolf();
		w3.color="white";
		w3.age=2;
		Wolf.numberOfWolves++;
		
		////////////////////////
		
		Fox f1=new Fox();
		f1.color="red";
		f1.speed="high";
		Fox.numberOfFoxes++;
		
		Fox f2=new Fox();
		f2.color="brown";
		f2.speed="Medium";
		Fox.numberOfFoxes++;
		
		Fox f3=new Fox();
		f3.color="black";
		f3.speed="low";
		Fox.numberOfFoxes++;
		
		////////////////////////
		
		Bear b1=new Bear();
		b1.type="polar bear";
		b1.weight=650;
		Bear.numberOfBears++;
		
		Bear b2=new Bear();
		b2.type="brown bear";
		b2.weight=575;
		Bear.numberOfBears++;
		
		Bear b3=new Bear();
		b3.type="grizzly bear";
		b3.weight=750;
		Bear.numberOfBears++;
		
		System.out.println(Bear.numberOfBears+Fox.numberOfFoxes+Wolf.numberOfWolves+" animals are in "
				+ "the forest in total");
		
	}

}

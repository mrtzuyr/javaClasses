package com.class31;

public abstract class Marks {
	/*
	 * We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
	 * by student A and in four subjects (each out of 100) by student B.
	 *  Create class ‘Marks’ with an abstract method ‘getPercentage’. 
	 *  It is inherited by classes ‘A’ and ‘B’ each having a method with the same name 
	 *  which returns the percentage of the students. The constructor of student A takes the marks
	 *   in three subjects as its parameters and the marks in 
	 * four subjects as its parameters for student B. Test your code
	 */
	

	    int Math;
	    int Physics;
	    int Biology;
	    int History;
	  
	    
	public Marks(int Math, int Physics, int Biology) {
	    this.Math = Math;
	    this.Physics = Physics;
	    this.Biology = Biology;
	}
	public Marks(int Math, int Physics, int Biology, int History) {
	    this(Math, Physics, Biology);
	    this.History = History;
	    // TODO Auto-generated constructor stub
	}
	    
	    public abstract double getPercentage();
	}
	class StudentA extends Marks {
	    
	    
	    
	    public StudentA(int Math, int Physics, int Biology) {
	    super(Math, Physics, Biology);
	    }
	    
	    @Override
	    public double getPercentage() {
	        int totalPercentage = (Math+Physics+Biology)/3;
	        return totalPercentage;
	    }
	}
	class StudentB extends Marks {
	    public StudentB(int Math, int Physics, int Biology, int History) {
	    super(Math, Physics, Biology, History);
	        
	    }
	    @Override
	    public double getPercentage() {
	       int  totalPercentage = (Math+Physics+Biology+History)/4;
	        return totalPercentage;
	    }
	    
	}
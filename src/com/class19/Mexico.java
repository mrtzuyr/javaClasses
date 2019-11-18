package com.class19;

import com.class20.USA;
//when usa class is not public it gives an error
//it has to be public to be accessible from another package
public class Mexico {
	public static void main(String[] args) {
		USA mex=new USA();
		
	//System.out.println(mex.capitalCity);
	//Gives an error because its private, it can 
	//only be seen within the same class
	
	System.out.println(mex.mainState);
	
	//System.out.println(mex.school);
	//System.out.println(mex.naturalState);
	//It is not public so not accessible from another package	
	}

}

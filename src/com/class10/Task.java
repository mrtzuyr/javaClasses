package com.class10;

public class Task {
	public static void main(String[] args) {
		
		/*Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
		
		char[] grades= {'A','B','C','D','E','F'};
		char[] grade=new char[6];
		   grade[0] ='A';
	       grade[1] ='B';
	       grade[2] ='C';
	       grade[3] ='D';
	       grade[4] ='E';
	       grade[5] ='F';
	       System.out.println(grade[0]+""+grades[1]);
	       
		System.out.println("--------------------------------------");
		
		/*Create an array of names and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array).
		 */
		
		String[] names= {"Ali","Veli","Murtaza"};
		String[] name=new String[3];
		name[0]="Ali";
		name[1]="Veli";
		name[2]="Murtaza";
				System.out.println(name[2]);
				
				
		System.out.println("--------------------------------------");
		
		/*Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using element of array:
		 *  “Saturday is Java coding Day”. 
		 */
		
		String[] s= {"Java","Saturday","day","coding","is"};
		System.out.println(s[1]+" "+s[4]+" "+s[0]+" "+s[3]+" "+s[2]);
		
		
		
	}

}

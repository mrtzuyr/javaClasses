package com.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		
		int[]array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		System.out.println(array[2]);
		System.out.println(array[3]+array[2]);
		
		//string array
		
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		System.out.println(classes[0]);
		
		
		String[] names=new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		// names[3]="Olga"; only during run time we will get an error
		
		System.out.println(names[2]);
		
		
	}

}

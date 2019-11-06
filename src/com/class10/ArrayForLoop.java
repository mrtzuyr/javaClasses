package com.class10;

public class ArrayForLoop {
	public static void main(String[] args) {
		
		String[] animals= {"Cat","Dog","Horse","Snake","Lion"};
		int size=animals.length;
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+ " ");
		}
		System.out.println();
		
		double [] d=new double[5];
		d[0]=1.2;
		d[1]=2.3;
		d[2]=3.4;
		d[3]=4.5;
		d[4]=5.6;
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i]+"   ");
		}
		
		
	}

}

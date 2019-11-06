package com.class11;

import java.util.Arrays;

public class TwoDimensionArrays {
	public static void main(String[] args) {
		
		int a[][]= new int[2][3];
		a[0][0]=34;
		a[0][1]=45;
		a[0][2]=31;
		a[1][0]=56;
		a[1][1]=43;
		a[1][2]=23;
		
		for (int i = 0; i <2; i++) {
			for (int j = 0; j <3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************");
		
		int [][] numbers= {
				{1,2,3,4,5 },
				{6,7,8,9,10,12,13},
				{3,4,6,7,8},
				{34,56,67}
		};
		
		System.out.println("The numbers of Rows are: "+numbers.length);
		System.out.println("The numbers of Columns are: "+numbers[1].length);
		
		System.out.println("~~~~");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	
		
		
	}

}

package com.class12;

public class FindDuplicatesInArray {
	public static void main(String[] args) {
		int[] array2= {2,5,7,5,4,7,4,3,};
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = i+1; j < array2.length; j++) {
				if(array2[i]==array2[j]) {
					System.out.print(array2[j]+" ");
				}
			}
		}
		
		
		
	}

}

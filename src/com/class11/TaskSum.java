package com.class11;

public class TaskSum {
	public static void main(String[] args) {
		int [][] numbers= {
				{2,3,4,5,},
				{6,7,8,9},
				{10,11,12,13}
		};
		int sum=0;
		for(int getRow[]:numbers) {
			for(int getColumn:getRow) {
				sum+=getColumn;
				}
			}
		System.out.println(sum);
		
		System.out.println("~~~~~~~~~");
	    int sum1=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
            	
                //System.out.print(numbers[i][j] + " ");
                
                sum1=sum1+numbers[i][j];
            }
            System.out.println();
        }
        System.out.println(sum1);
	}

}

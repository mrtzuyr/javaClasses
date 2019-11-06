package com.class11;

import java.util.Arrays;

public class ArrayManipulation {
	public static void main(String[] args) {
		
		String[] names= {"John", "Alex", "Smith", "Tanaz"};
        System.out.println(Arrays.toString(names));
        
        System.out.println("*********");
        
        String[] name= {"John", "Alex", "Smith", "Tanaz"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        
        System.out.println("*********");
        
        int[] numbers= {123,34,15,66,99};
        
        for(int i:numbers) {
            System.out.print(i+" ");
        }
        
        System.out.println();
        System.out.println("*********");
        
        
        Arrays.sort(numbers);
        for(int i:numbers) {
            System.out.print(i+" ");
        }
        System.out.println();
        int[] number= {123,34,15,66,99};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
       
	}

}

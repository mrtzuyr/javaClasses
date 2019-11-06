package com.class10;

public class ArrayDemo {
	public static void main(String[] args) {
		int []nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		System.out.println(nums.length);
		
		String[] seasons= {"winter","fall","summer","spring"};
		System.out.println("I was born in "+seasons[2]);
		int size=seasons.length;
		System.out.println(size);
		
	}

}

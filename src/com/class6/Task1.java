package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a sale? true or false");
		boolean isSale=scan.nextBoolean();
		
		double price, finalPrice, discount;
		
		
		if(isSale) {
			System.out.println("How much it is?");
			price=scan.nextInt();
			
			if(price<20) {
				discount=price*0.1;
				
			}else if(price>=20 && price<100) {
				discount=price*0.2;
				
			}else if(price>=100 && price<500) {
				discount=price*0.3;
				
			}else {
				discount=price*0.5;
			
			}
			
			finalPrice=price-discount;
			System.out.println("After discount "+discount+" the price of item reduced from "+ price +" to "
			+finalPrice);
		
		
		}else {
			System.out.println("I am not shopping");
		}
		

		
		
	}

}

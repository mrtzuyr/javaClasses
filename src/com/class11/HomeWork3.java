package com.class11;

public class HomeWork3 {
	public static void main(String[] args) {
		//Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array
		
		String[] countries= {"American","German","Italian","Japan"};
		String[][]cars= {{"Jeep","Buick","Ford","Dodge","asd"},
						{"Mercedes","Volkswagen","Audi","Porsche"},
						{"Ferrari","Fiat","Maserati","Lamborghini"},
						{"Toyota","Honda","Mazda","Lexus"}
		};
		
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i]+" car brands are ");
			for (int k = i; k <= i; k++) {
				for (int j = 0; j < cars[k].length; j++) {
					System.out.print(cars[k][j]+", ");
				}
				System.out.println();
			}
			
		}
		
	}

}

package com.class6;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		//based on country we will specify fav food
		
		Scanner scan=new Scanner(System.in);
		String country, foodName;
		
		System.out.println("What country are you from?");
		country = scan.nextLine();
        switch (country) {
        case "Turkey":
            foodName = "Kebab";
            break;
        case "Etiopia":
            foodName = "teps";
            break;
        case "Morocco":
            foodName = "Tajin";
            break;
        case "Kazakhstan":
            foodName = "Kumis";
            break;
        case "Pakistan":
            foodName = "Beryani";
            break;
        case "Russia":
            foodName = "Caviar";
            break;
        case "Cuba":
            foodName = "sofrito";
            break;
        default:
            foodName = "Unknown";
        }
        System.out.println("You are from " + country +
        		" and your favorite food is " + foodName);
    
	}

}

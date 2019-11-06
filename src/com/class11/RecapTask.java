package com.class11;

public class RecapTask {
	public static void main(String[] args) {
		String [] cars= {"Honda","Toyota", "Ford", "Nissan", "Mazda", "Infinity"};
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		for(String a:cars) {
			System.out.println(a);
		}
		
		System.out.println("---------------------------");
		
		int [] nums= {1,4,6,8,5,3,9,23,12};
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
		}
		System.out.println(sum);
		System.out.println("----------------------------");
		
		String [] countries= {"Italy","France","Germany","Mexico"};
		
		for (String c:countries) {
			switch(c) {
			case "Italy":
				System.out.println("Rome");
				break;
			case "France":
				System.out.println("Paris");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;
			case "Mexico":
				System.out.println("Mexico City");
				break;
				default:
				System.out.println();
				
					System.out.println(c);
			}
			
		}
		
		
		
		
	}

}

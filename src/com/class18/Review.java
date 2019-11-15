package com.class18;

public class Review {
	
	void car(String make, String model) {
		System.out.println("I drive "+make+" "+model);
		if(make.equalsIgnoreCase("honda")||make.equalsIgnoreCase("toyota")||
				make.equalsIgnoreCase("lexus")||make.equalsIgnoreCase("acura")||
				make.equalsIgnoreCase("nissan")) {
		 System.out.println(make+ " is a Japan car");
		}
		 switch(model.toLowerCase()) {
		 case "accord":
			 System.out.println("Now I drive "+"Insight");
			 break;
		 case "sonata":
			 System.out.println("Now I drive "+"Elentra");
			 break;
		 case "arteon":
			 System.out.println("Now I drive "+"Passat");
			 break;
		 case "altima":
			 System.out.println("Now I drive "+"Maxima");
			 break;
			 default:
				 System.out.println("....");
		 }
			
		}

	
	public static void main(String[] args) {
		Review obj=new Review();
		obj.car("Honda", "Accord");
		obj.car("Hyundai", "Sonata");
		obj.car("VW", "Arteon");
		obj.car("Toyota", "Avalon");
		obj.car("Lexus", "XL");
		obj.car("Acura", "M5");
		obj.car("Nissan", "Altima");
		obj.car("Chevrolet", "Malibu");
		
		
		
		
	}

}

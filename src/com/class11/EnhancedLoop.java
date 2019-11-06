package com.class11;

public class EnhancedLoop { 
	public static void main(String[] args) {
		
		String[][] names= {
                {"Halime","Yousuf","Alex","Zynab","jjj"},
                {"Mohammad","Ann","Naslyhan","Weqas"},
                {"Diago","Asif","Zubair","Shogofa"},    
        };
        
		
        
        for(String getArrays[]: names) {
            for(String getName: getArrays) {
                
                System.out.print(getName+" ");;
                
            }
            System.out.println();
            
        }
				
				
				
	}
}

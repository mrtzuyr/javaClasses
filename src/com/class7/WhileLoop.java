package com.class7;

public class WhileLoop {
	public static void main(String[] args) {
 int time=8;
        
        if(time<12) {
            System.out.println("Good morning");
        }
         while (time<12) {
             System.out.println("Good morning");
           time++;
         }
         
         int i=1;
         while(i<=20) {
        	 System.out.println(i++);
        	 }
         int a=50;
         while(a>=20) {
        	 System.out.println(a--);
         }
         System.out.println("********************************************");
         
        // even numbers 1-20
         int z=2;
        		 while(z<=20) {
        			 System.out.println(z);
        			 z+=2;
        		 }
        		   
        		 int q=1;
        		 while(q<=20) {
        			
        			 if(q%2==0) {
        				 System.out.println(q);
        				 
        			 }
        			 q++;
        			
        		 }        		 
       
        	
        		 
        		 
	}

}

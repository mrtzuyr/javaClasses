package com.class8;

public class ForLoopExample {
	public static void main(String[] args) {
		

        int sum=0;
        for (int i=1; i<=5; i++) {
        	sum=sum + i;
        	System.out.print(sum+"+");
        }
        System.out.println();
        System.out.println(sum);
        
        
        int sumAll=0;
        for(int i=0; i<=20; i+=5) {//
        	sumAll=sumAll+i;
        }
        System.out.println(sumAll);
        
        
        int total=2;
        for(int y=1; y<=3; y++) {//2=2*1, 4=2*2, 12=4*3
        	total=total*y;
        }
        System.out.println(total);
        
        
	}

}

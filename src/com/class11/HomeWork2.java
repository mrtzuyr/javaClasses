package com.class11;

public class HomeWork2 {
	public static void main(String[] args) {
		/*Create a 2D array that first row will contain 
		 * 4 names and second row will contain grades. 
		 * Then you program should print name of the 
		 * students that has as an A and B grade
		 */
		
		String [][] a= {{"Ali","Veli","Ayse","Fatma"},
						{"A","B","C","F"}};
		 for (int i = 0; i < a.length-1; i++) {
			 for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]+" "+a[i+1][j]);
			}
			
		}
		
		
		
	}
}

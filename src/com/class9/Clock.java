package com.class9;

public class Clock {

	public static void main(String[] args) {

		// 24 hours, 60 minutes

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				for(int s=0; s<60; s++) {
					if (m < 10&& s<10) {
						System.out.println(h + ":0" + m+":0"+s);
					}else if (m < 10 && s>10) {
						System.out.println(h + ":0" + m+":"+s);
					}else if (m > 10 && s<10) {
						System.out.println(h +":"+ m+":0"+s);
					}
					else {
						System.out.println(h + ":" + m+":"+s);
					}
				}
			}
		}
		
	}

}

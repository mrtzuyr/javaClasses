package com.class3;

public class TemperatureCheck {
	public static void main(String[] args) {
		int t=53;
		if(t<32) {
			System.out.println("Water will freeze with temperature "+t);
		}else {
			System.out.println("Water will not freeze with temperature "+t);
		}
		
		String result=(t<32)?"Water will freeze with temperature "+t :"Water will not freeze with temperature "+t;
		System.out.println(result);
	}
}

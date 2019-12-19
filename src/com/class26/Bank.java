package com.class26;

public class Bank {

	double money;
	
	public double chargeFee() {
		double fee;
		if(money<1000) {
			fee=money*0.1;
		}else{
			fee=0;
		}
		return fee;
	}
}

class PNC extends Bank{
	@Override // it gives an error if you are not overriding 
	public double chargeFee() {
		double fee;
		if(money<1000) {
			fee=money*0.05;
		}else{
			fee=0;
		}
		return fee;
	}

}
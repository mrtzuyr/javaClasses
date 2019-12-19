package com.class31;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acc =new Account();
		
		//acc.accountNumber=4684884;
		//acc.balance=2354346l;
		
		acc.setAccountNumber(123456789);
		acc.setBalance(1200);
		
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getBalance());
		
		
		
	}
}

package com.class19;

public class MethodWithReturnValue {
	public static void main(String[] args) {
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		int sum=obj.sum(12,12);
		System.out.println(sum);
		int large=obj.findLargest(23, 34);
		System.out.println(large);
		boolean odd=obj.isOdd(large);
		System.out.println(odd);
	}
	
	//return type, method name(method header), lists of parameters)
	int sum(int n1,int n2) {
		int sum=n1+n2;
		return sum;
	}
	
	int findLargest(int n1, int n2) {
		int largest;
		if(n1>n2) {
			 largest=n1;
		} else {
			 largest=n2;
		}
		return largest;
	}
	
	boolean isOdd(int a) {
		boolean isOdd;
		if (a%2!=0) {
			isOdd=true;
		}else {
			isOdd=false;
		}
		return isOdd;
	}

}

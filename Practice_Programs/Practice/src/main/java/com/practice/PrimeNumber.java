package com.practice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 10;
		
		if(num<=1) {
			System.out.println("Number Should be Greater than one.");
		}
		else {
			
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					System.out.println("Number is not prime Number");
					System.exit(0);
				}
				
			}
			System.out.println("Number is Prime Number.");
		}
	}
}

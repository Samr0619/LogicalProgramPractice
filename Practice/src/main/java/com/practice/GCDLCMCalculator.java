package com.practice;

import java.util.Scanner;

public class GCDLCMCalculator {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        
	        int gcd = calculateGCD(num1, num2);
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

	        int lcm = calculateLCM(num1, num2);
	        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

	}
	
	public static int calculateGCD(int a,int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		
		return Math.abs(a);
	}
	
	
	public static int calculateLCM(int a,int b) {
		if(a == 0 || b==0) {
			return 0;
		}
		else {
			return Math.abs(a * b)/ calculateGCD(a, b);
		}
	}

}

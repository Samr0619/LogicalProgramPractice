package com.practice2;

public class SwapNumbers {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping : a : "+a+"  b : "+b);
		
		//swap
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Swapped Values : a : "+a+"  b : "+b);
		
	}
}

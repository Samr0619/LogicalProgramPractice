package com.practice2;

public class SwapStirngs {
	public static void main(String[] args) {
		
		String a = "Samruddha";
		String b = "Sawant";
		System.out.println("Before Swap : a : "+a+" b : "+b);
		
		a =a+b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println("After Swap : a : "+a+" b : "+b);
		
	}
}

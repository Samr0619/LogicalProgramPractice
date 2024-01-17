package com.practice2;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		int num = 1551;
		
		String strNumber = Integer.toString(num);
		StringBuilder revstr = new StringBuilder(strNumber).reverse();
		
		if(strNumber.equals(revstr.toString())) {
			System.out.println(num+" is Palidrome");
		}
		else {
			System.out.println(num+" is not Palidrome");
		}
		
	}

}

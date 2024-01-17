package com.practice2;

import java.util.Arrays;

public class SumOfSecondMinMax {
	
	public static void main(String[] args) {
		 int[] array = {5, 2, 8, 9, 1, 3, 7};
		 
		 Arrays.sort(array);
		 
		 int sec_min = array[1];
		 int sec_max = array[array.length - 2];
		 
		 System.out.println("Sum : "+(sec_max+sec_min));
	}

}

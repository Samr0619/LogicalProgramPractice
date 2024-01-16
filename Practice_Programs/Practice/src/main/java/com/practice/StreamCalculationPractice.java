package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamCalculationPractice {

	public static void main(String[] args) {
		
		int arr[] = {2,4,7,9,-8,3};
		
		
		int num = Arrays.stream(arr).map(n -> n>0 ? n%2 == 0 ? n * 2 : n * 3 : n/2).sum();
		System.out.println("num : "+num);
		
		 System.out.println("Min : "+Arrays.stream(arr).min());
		 System.out.println("Max : "+Arrays.stream(arr).max());

		 OptionalInt max = Arrays.stream(arr).max();
	}
}

package com.practice2;

public class ReverseIntegerArrayInPlace {
	public static void main(String[] args) {
		int[]arr = {10,20,30,40,50};
		
		for(int i=0;i<arr.length/2;i++) {
			
			int tmp = arr[i]+arr[arr.length-i-1];
			arr[i] = tmp - arr[i];
			arr[arr.length-i-1] = tmp - arr[i];
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}

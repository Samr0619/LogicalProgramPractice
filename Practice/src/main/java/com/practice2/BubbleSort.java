package com.practice2;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {5,4,3,1,2,4,9};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=  temp;
				}
			}
		}
		
		
		//print Array
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
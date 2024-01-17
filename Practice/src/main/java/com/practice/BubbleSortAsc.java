package com.practice;

public class BubbleSortAsc {
	
	public static void main(String[] args) {
		
		int arr[] = {5,4,8,3,6,0};
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

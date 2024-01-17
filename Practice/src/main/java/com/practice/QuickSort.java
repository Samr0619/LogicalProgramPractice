package com.practice;

public class QuickSort {
public static void main(String[] args) {
	
	int[] arr = {4,7,1,3,2,8,9,0};
	
	quickSort(arr, 0, arr.length-1);
	
	for(int i=0;i<arr.length;i++){
		System.out.print(" "+arr[i]);
	}
}


public static void quickSort(int arr[],int start,int end) {
	if(end<=start) {
		return;
	}
	
	int pivot = partition(arr, start, end);
	
	quickSort(arr, start, pivot - 1);
	quickSort(arr, pivot+1, end);
	
}


public static int partition(int arr[],int start,int end) {
	int pivot = arr[end];
	int temp = 0;
	int i = start - 1;
	
	for(int j=start;j<end;j++) {
		if(arr[j]<pivot) {
			i++;
			temp = arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
		}
	}
	i++;
	temp = arr[i];
	arr[i]= arr[end];
	arr[end] = temp;
	
	return i;
}
}

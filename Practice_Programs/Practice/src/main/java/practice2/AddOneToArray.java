package com.practice2;

public class AddOneToArray {
	
	public static void main(String[] args) {
		
		int[] inputArray = {9, 9, 9};
		
		  int[] resultArray = addOne(inputArray);
	        
	        System.out.print("Output Array: ");
	        printArray(resultArray);
	}
	
	public static int[] addOne(int[] array) {
		int arr_len = array.length;
		
		int carry = 1;
		
		for(int i= arr_len-1;i>=0;i--) {
			int sum= array[i] + carry;
			array[i] = sum % 10;
			carry = sum/10;
			
			 if (carry == 0) {
	             break;
	         }
		}
		
		 if (carry > 0) {
	            int[] resultArray = new int[arr_len + 1];
	            resultArray[0] = carry;
	            System.arraycopy(array, 0, resultArray, 1, arr_len);
	            return resultArray;
	        } else {
	            return array;
	        }
		
	}
	
	 public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	
	

}

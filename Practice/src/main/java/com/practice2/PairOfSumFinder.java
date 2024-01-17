package com.practice2;

import java.util.HashMap;
import java.util.Map;

public class PairOfSumFinder {
	
	public static void main(String[] args) {
		 int[] array = {3, 7, 2, 8, 1, 9};
	        int targetSum = 10;

	        findPairs(array, targetSum);
	}
	
	public static void findPairs(int[] array, int targetSum) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<array.length;i++) {
			int currElm = array[i];
			int difference = targetSum - currElm;
			
			if(map.containsKey(difference)) {
				System.out.println("Pair found: (" + map.get(difference) + ", " + currElm + ")");
			}
			
			map.put(currElm, currElm);
			
		}
	}

}

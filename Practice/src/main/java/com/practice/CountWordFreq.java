package com.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountWordFreq {

	public static void main(String[] args) {
		
		String text = "Java is Programming Language and I like Java";
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		String arr[] = text.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		
		for(Entry<String, Integer> eMap : map.entrySet()) {
			System.out.println("Word : "+eMap.getKey()+" : "+eMap.getValue());
		}
	}
	
	
}

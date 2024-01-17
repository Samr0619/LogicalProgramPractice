package com.practice;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "EARTH";
		String s2 = "HEART";
		
		isAnagram(s1, s2);
		
	}
	
	public static void isAnagram(String s1,String s2) {
		
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(s1.length() != s2.length()) {
			status = false;
		}
		else {
			char[] arrayS1 = s1.toLowerCase().toCharArray();
			char[] arrayS2 = s2.toLowerCase().toCharArray();
			
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			
			status = Arrays.equals(arrayS1, arrayS2);
			
			if(status) {
				System.out.println(s1+" and "+s2+" are Anagram");
			}
			else {
				System.out.println(s1+" and "+s2+" are Not Anagram");
			}
			
		}
	}

}

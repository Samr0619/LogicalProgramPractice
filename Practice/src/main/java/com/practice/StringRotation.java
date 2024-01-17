package com.practice;

public class StringRotation {
	 public static void main(String[] args) {
	        String str1 = "abcd";
	        String str2 = "bcda";

	        if (isRotation(str1, str2)) {
	            System.out.println(str2 + " is a rotation of " + str1);
	        } else {
	            System.out.println(str2 + " is not a rotation of " + str1);
	        }
	        
	    }
     
     private static boolean isRotation(String str1,String str2) {
    	 if(str1.length() != str2.length() || str1.length()==0) {
    		 return false;
    	 }
    	 
    	 String contactedStr = str1 + str1;
    	 
    	 return (contactedStr.contains(str2));
     }
     
}

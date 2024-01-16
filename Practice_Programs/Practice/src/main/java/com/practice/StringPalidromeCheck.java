package com.practice;

public class StringPalidromeCheck {
	
public static void main(String[] args) {
	
	String str = "nayan";
	
	String temp = new String();
	
	for(int i=str.length()-1;i>=0;i--) {
		temp+=str.charAt(i);
	}
	
	
	if(temp.equals(str)) {
		System.out.println("String is Palidrome");
	}
	else {
		System.out.println("String is not Palidrome");
	}
	
}

}

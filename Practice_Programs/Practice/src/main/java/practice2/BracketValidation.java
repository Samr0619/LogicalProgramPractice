package com.practice2;

import java.util.Stack;

public class BracketValidation {
	public static void main(String[] args) {
		String exp = "{()}[]";
		
		System.out.println("isvalid : "+isValid(exp));
	}
	
	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch : str.toCharArray()) {
			switch(ch) {
				case '{':
				case '[':
				case '(':
					stack.push(ch);
					break;
				case '}':
					if(stack.isEmpty() || stack.pop() != '{') return false;
                    break;
				case ')':
					if(stack.isEmpty() || stack.pop() != '(') return false;
					break;
				case ']':
					if(stack.isEmpty() || stack.pop() != '[') return false;
					break;					
			}
		}
		return stack.isEmpty();
	}
}

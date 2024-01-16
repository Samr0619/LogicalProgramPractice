package com.practice;

public class StackImplementationWithArray {
	
	static final int MAX = 1000;
	int top=-1;
	int arr[]= new int[MAX];
	
	
	
	public static void main(String[] args) {
		
		StackImplementationWithArray stk = new StackImplementationWithArray();
		
		stk.push(5);
		stk.push(510);
		stk.push(59);
		stk.push(15);
		
		stk.print();
		
		stk.pop();
		
		stk.print();
		
		System.err.println("Peek : "+stk.peek());
	}

	boolean push(int x) {
		
		if(top>=(MAX-1)) {
			System.out.println("StackOverFlow");
			return false;
		}
		else {
			arr[++top] = x;
			System.out.println("Element Pushed");
			return true;
		}
		
	}
	
	
	boolean pop() {
		if(top<0) {
			System.out.println("StackUnderFlow");
			return false;
		}
		else {
			int x = arr[top--];
			System.out.println("Element Poped");
			return true;
		}
	}
	
	int peek() {
		if(top<0) {
			System.out.println("StackUnderFlow");
			return 0;
		}
		else {
			return arr[top];
		}
	}
	
	void print(){ 
	    for(int i = top;i>-1;i--){ 
	      System.out.print(" "+ arr[i]); 
	    } 
	    System.out.println();
	  } 
}

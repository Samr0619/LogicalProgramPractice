package com.practice;

import java.util.Scanner;

public class QueueImplementation {
	int SIZE_OF_QUEUE = 8;  
	int array_of_Queue[] = new int[SIZE_OF_QUEUE];  
	int front_index, rear_index;  
	  
	public QueueImplementation() {
		// TODO Auto-generated constructor stub
		front_index = -1;
		rear_index = -1;
	}  
	  
	
	boolean isFull() {
		 if (front_index == 0 && rear_index == SIZE_OF_QUEUE - 1) {  
		      return true;  
		    }  
		    return false;  
	}
	
	 boolean isEmpty() {  
		    if (front_index == -1)  
		      return true;  
		    else  
		      return false;  
	}  
	 
	 
	
	void enQueue(int element) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			if(front_index == -1) {
				front_index = 0;
			}
			
			rear_index++;
			array_of_Queue[rear_index] = element;
			System.out.println("Inserted");
		}
	}
	
	
	int deQueue() {
		int x;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return (-1);
		}
		else {
			x= array_of_Queue[front_index];
			
			if(front_index>=rear_index) {
				front_index = -1;
				rear_index = -1;
			}
			else {
				front_index++;
			}
			
			System.out.println(x + "  Deleted");
			return x;
		}
		
		
	}
	  
	void display() {  
	    int i;  
	    if (isEmpty()) {  
	      System.out.println("Empty Queue_Data_Structure");  
	    }  
	    else {  
	      System.out.println("front_index index-> " + front_index);  
	  
	      System.out.println("array_of_Queue -> ");  
	      for (i = front_index; i <= rear_index; i++)  
	        System.out.print(array_of_Queue[i] + "  ");  
	  
	      System.out.println("\nrear_index index-> " + rear_index);  
	    }  
	  }  
	  
	  public static void main(String[] args) {
		QueueImplementation q = new QueueImplementation();
		
		char ch;  
	    System.out.println("SIZE of Queue Data Structure is 8\n");  
	    Scanner scan = new Scanner(System.in);  
	        /**  Perform operations  **/  
	        do      
	        {  
	            System.out.println("\nSelect one of the operations::");  
	            System.out.println("1. To insert data in the Queue_Data_Structure Data Structure.");  
	            System.out.println("2. To display the data present in the Queue_Data_Structure Data Structure.");  
	            System.out.println("3. To perform deQueue_Data_Structure operation on the Queue_Data_Structure Data Structure.");  
	   
	            int choice = scan.nextInt();              
	            switch (choice)  
	            {  
	            case 1 :   
	                System.out.println("Enter integer element to insert");  
	                int val = scan.nextInt();  
	                q.enQueue(val);                       
	                break;                            
	            case 2 :   
	                System.out.println("Queue_Data_Structure::");  
	                q.display();  
	                break;                                            
	            case 3 :   
	                // System.out.println("Data removed.");  
	                q.deQueue();  
	                break;       
	            default :   
	                System.out.println("Wrong Entry \n ");  
	                break;     
	            }  
	            System.out.println("\nDo you want to continue (Type y or n) \n");  
	            ch = scan.next().charAt(0);                          
	        } while (ch == 'Y'|| ch == 'y');  
	  }  
	  
}

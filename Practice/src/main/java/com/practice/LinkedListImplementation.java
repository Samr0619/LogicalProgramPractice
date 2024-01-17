package com.practice;

public class LinkedListImplementation {

	public static void main(String[] args) {
		 LinkedList linkedList = new LinkedList();

	        linkedList.insert(1);
	        linkedList.insert(2);
	        linkedList.insert(3);
	        linkedList.insert(4);

	        System.out.println("Original Linked List:");
	        linkedList.traverse();

	        linkedList.delete(2);
	        System.out.println("Linked List after deleting 2:");
	        linkedList.traverse();

	        linkedList.delete(5);
	        System.out.println("Linked List after attempting to delete 5:");
	        linkedList.traverse();
	        
	        linkedList.reverse();
	        System.out.println("Linked List reversed:");
	        linkedList.traverse();
	}
}

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	private Node head;

	public LinkedList() {
		head = null;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			
			while(temp.next!=null) {
				temp = temp.next;
			}
			
			temp.next = newNode;
		}
	}
	
	
	public void delete(int data) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		while(temp.next != null && temp.next.data != data) {
			temp = temp.next;
		}
		
		 if (temp.next == null) {
	            System.out.println("Element not found in the list.");
	        } else {
	            temp.next = temp.next.next;
	        }
	}
	
	
	  public void traverse() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	
	  
	  public void reverse() {
		  Node prev = null;
		  Node current = head;
		  Node next = null;
		  
		  while(current != null) {
			  next = current.next;
			  current.next = prev;
			  prev = current;
			  current = next;
		  }
		  
		  head = prev;
	  }
	
}

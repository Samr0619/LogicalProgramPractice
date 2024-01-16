package com.practice;

import java.util.Scanner;

public class ExceptionHandlingExample {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Example 1: Divide by zero
	        try {
	            System.out.println("Enter numerator:");
	            int numerator = scanner.nextInt();

	            System.out.println("Enter denominator:");
	            int denominator = scanner.nextInt();

	            int result = divideNumbers(numerator, denominator);
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        }

	        // Example 2: Array out of bounds
	        try {
	            System.out.println("\nEnter the size of the array:");
	            int size = scanner.nextInt();

	            int[] array = new int[size];

	            System.out.println("Enter the index to access in the array:");
	            int index = scanner.nextInt();

	            int value = accessArrayElement(array, index);
	            System.out.println("Value at index " + index + ": " + value);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	 }
	        
	        private static int divideNumbers(int numerator, int denominator) {
	            if (denominator == 0) {
	                throw new ArithmeticException("Cannot divide by zero");
	            }
	            return numerator / denominator;
	        }

	        private static int accessArrayElement(int[] array, int index) {
	            if (index < 0 || index >= array.length) {
	                throw new ArrayIndexOutOfBoundsException("Index out of bounds");
	            }
	            return array[index];
	        }
}

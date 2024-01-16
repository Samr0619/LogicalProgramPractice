package com.practice;

public class MatrixMultiplication {
	
	public static int[][] multiplyMatrices(int[][] a,int[][] b){
		int m = a.length;
		int n_a = a[0].length;
		int n_b = b.length;
		int p = b[0].length;
		
		if(n_a != n_b) {
            throw new IllegalArgumentException("Number of columns in A must be equal to the number of rows in B.");
		}
		
		 int[][] C = new int[m][p];
		 
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < p; j++) {
	                for (int k = 0; k < n_a; k++) {
	                    C[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }

	        return C;
	}
	
	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		 int[][] matrixA = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[][] matrixB = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 1}
		        };

		        System.out.println("Matrix A:");
		        printMatrix(matrixA);

		        System.out.println("Matrix B:");
		        printMatrix(matrixB);

		        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

		        System.out.println("Result Matrix (Matrix A * Matrix B):");
		        printMatrix(resultMatrix);
	}

}

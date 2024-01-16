package com.practice;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Get the number of rows and columns in the original matrix
        int rows = originalMatrix.length;
        int columns = originalMatrix[0].length;

        // Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(originalMatrix, rows, columns);

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(originalMatrix, rows, columns);

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix, columns, rows);
    }

    // Function to transpose a matrix
    private static int[][] transposeMatrix(int[][] matrix, int rows, int columns) {
        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // Function to print a matrix
    private static void printMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
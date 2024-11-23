package com.bextdev.Gaussian;

public class MatrixOperations {

    public static void swapRows(double[][] matrix, int row1, int row2) {
        double[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }

    public static void printMatrix(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rowOperation(double[][] matrix, int j, int i, double factor, int n) {
        for (int k = i; k < n + 1; k++) {
            matrix[j][k] -= matrix[i][k] * factor;
        }
    }

    public static double calculateFactor(double[][] matrix, int row, int col) {
        if (matrix[col][col] == 0) {
            throw new ArithmeticException("Division by zero detected while calculating factor.");
        }
        return matrix[row][col] / matrix[col][col];
    }
}

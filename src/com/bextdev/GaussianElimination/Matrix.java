package com.bextdev.GaussianElimination;

public class Matrix {
    private double[][] augmentedMatrix;
    private int n;

    public Matrix(double[][] A, double[] b) {
        this.n = A.length;
        this.augmentedMatrix = new double[n][n + 1];

        // Form the augmented matrix [A|b]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatrix[i][j] = A[i][j];
            }
            augmentedMatrix[i][n] = b[i];
        }
    }

    public double[][] getAugmentedMatrix() {
        return augmentedMatrix;
    }

    public int getSize() {
        return n;
    }

    // Utility method to print matrix (for debugging)
    public void printMatrix() {
        MatrixOperations.printMatrix(augmentedMatrix, n);
    }

    // Method to swap rows using MatrixOperations
    public void swapRows(int row1, int row2) {
        MatrixOperations.swapRows(augmentedMatrix, row1, row2);
    }

    // Method to perform a row operation: row[j] -= factor * row[i]
    public void rowOperation(int j, int i, double factor) {
        MatrixOperations.rowOperation(augmentedMatrix, j, i, factor, n);
    }

    // Method to calculate the factor for Gaussian elimination
    public double calculateFactor(int row, int col) {
        return MatrixOperations.calculateFactor(augmentedMatrix, row, col);
    }
}

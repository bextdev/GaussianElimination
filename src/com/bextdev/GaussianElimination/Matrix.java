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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                return augmentedMatrix[i][j] + " ";
            }
                return;
        }
    }
}

package com.bextdev.Gaussian;

public class Matrix {
    private final double[][] augmentedMatrix;
    private final int n;

    public Matrix(double[][] A, double[] b) {
        if (A == null || b == null || A.length != b.length) {
            throw new IllegalArgumentException("Matrix A and vector b must be non-null and of compatible dimensions.");
        }
        this.n = A.length;
        this.augmentedMatrix = new double[n][n + 1];
        for (int i = 0; i < n; i++) {
            System.arraycopy(A[i], 0, augmentedMatrix[i], 0, n);
            augmentedMatrix[i][n] = b[i];
        }
    }

    public double[][] getAugmentedMatrix() {
        return augmentedMatrix;
    }

    public int getSize() {
        return n;
    }

    public void swapRows(int row1, int row2) {
        MatrixOperations.swapRows(augmentedMatrix, row1, row2);
    }

    public void rowOperation(int j, int i, double factor) {
        MatrixOperations.rowOperation(augmentedMatrix, j, i, factor, n);
    }
}


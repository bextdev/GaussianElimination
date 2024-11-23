package com.bextdev.Gaussian;

public class GaussianEliminationHelper {

    public void performGaussianElimination(Matrix matrix) {
        double[][] augmentedMatrix = matrix.getAugmentedMatrix();
        int n = matrix.getSize();

        for (int i = 0; i < n; i++) {
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(augmentedMatrix[j][i]) > Math.abs(augmentedMatrix[maxRow][i])) {
                    maxRow = j;
                }
            }

            matrix.swapRows(i, maxRow);

            for (int j = i + 1; j < n; j++) {
                if (augmentedMatrix[i][i] == 0) {
                    throw new ArithmeticException("Division by zero detected during Gaussian elimination.");
                }
                double factor = augmentedMatrix[j][i] / augmentedMatrix[i][i];
                matrix.rowOperation(j, i, factor);
            }
        }
    }
}



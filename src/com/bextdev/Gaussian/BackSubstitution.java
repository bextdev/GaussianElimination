package com.bextdev.Gaussian;

public class BackSubstitution {

    public double[] performBackSubstitution(Matrix matrix) {
        int n = matrix.getSize();
        double[][] augmentedMatrix = matrix.getAugmentedMatrix();
        double[] result = new double[n];

        for (int i = n - 1; i >= 0; i--) {
            if (augmentedMatrix[i][i] == 0) {
                throw new ArithmeticException("Division by zero during back substitution. The system might be singular.");
            }
            result[i] = augmentedMatrix[i][n] / augmentedMatrix[i][i];
            for (int j = i - 1; j >= 0; j--) {
                augmentedMatrix[j][n] -= augmentedMatrix[j][i] * result[i];
            }
        }
        return result;
    }
}


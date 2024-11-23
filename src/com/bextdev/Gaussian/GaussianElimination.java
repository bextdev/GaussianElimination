package com.bextdev.Gaussian;

public class GaussianElimination {
    private GaussianEliminationHelper gaussianEliminationHelper;
    private BackSubstitution backSubstitution;
    private Matrix matrix;

    public GaussianElimination() {
        gaussianEliminationHelper = new GaussianEliminationHelper();
        backSubstitution = new BackSubstitution();
    }

    public double[] solve(double[][] A, double[] b) {
        if (A == null || b == null || A.length != b.length) {
            throw new IllegalArgumentException("Matrix A and vector b must be non-null and of compatible dimensions.");
        }
        matrix = new Matrix(A, b);
        gaussianEliminationHelper.performGaussianElimination(matrix);
        return backSubstitution.performBackSubstitution(matrix);
    }

    public String getSolution() {
        StringBuilder solutionString = new StringBuilder("Solution: ");
        double[] solution = solve(new double[][]{{2, 3, 1}, {4, 1, 2}, {3, 2, 3}}, new double[]{1, 2, 3});
        for (double x : solution) {
            solutionString.append(x).append("\n");
        }
        return solutionString.toString();
    }
}

package com.bextdev.GaussianElimination;

public class GaussianElimination {
    private Matrix matrix;
    private GaussianEliminationHelper gaussianEliminationHelper;
    private BackSubstitutionHelper backSubstitutionHelper;

    // Method to solve the system of equations Ax = b
    public static double[] solve(double[][] A, double[] b) {
        matrix = new Matrix(A, b);

        // Perform Gaussian elimination
        gaussianEliminationHelper.performGaussianElimination(matrix);

        // Perform back substitution
        return backSubstitutionHelper.performBackSubstitution(matrix);
    }

    public static String getSolution() {
        // Example 3x3 matrix system
        double[][] A = {
            {2, 3, 1},
            {4, 1, 2},
            {3, 2, 3}
        };
        double[] b = {1, 2, 3};

        // Solve the system Ax = b
        double[] solution = solve(A, b);

        // Build the solution string to return
        StringBuilder solutionString = new StringBuilder("Solution: ");
        for (double x : solution) {
            solutionString.append(x).append("\n");
        }

        return solutionString.toString();
    }
}
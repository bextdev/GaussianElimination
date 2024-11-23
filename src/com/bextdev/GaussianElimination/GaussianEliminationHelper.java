public class GaussianEliminationHelper {

    // Method to perform Gaussian elimination
    public static void performGaussianElimination(Matrix matrix) {
        double[][] augmentedMatrix = matrix.getAugmentedMatrix();
        int n = matrix.getSize();

        for (int i = 0; i < n; i++) {
            // Search for maximum in this column
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(augmentedMatrix[j][i]) > Math.abs(augmentedMatrix[maxRow][i])) {
                    maxRow = j;
                }
            }

            // Swap maximum row with current row
            double[] temp = augmentedMatrix[i];
            augmentedMatrix[i] = augmentedMatrix[maxRow];
            augmentedMatrix[maxRow] = temp;

            // Make the diagonal contain all 1's
            for (int j = i + 1; j < n; j++) {
                double factor = augmentedMatrix[j][i] / augmentedMatrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    augmentedMatrix[j][k] -= augmentedMatrix[i][k] * factor;
                }
            }
        }
    }
}

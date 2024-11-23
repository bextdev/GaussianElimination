public class BackSubstitutionHelper {

    // Method to perform back substitution
    public static double[] performBackSubstitution(Matrix matrix) {
        int n = matrix.getSize();
        double[][] augmentedMatrix = matrix.getAugmentedMatrix();
        double[] result = new double[n];

        // Back substitution
        for (int i = n - 1; i >= 0; i--) {
            result[i] = augmentedMatrix[i][n] / augmentedMatrix[i][i];
            for (int j = i - 1; j >= 0; j--) {
                augmentedMatrix[j][n] -= augmentedMatrix[j][i] * result[i];
            }
        }
        return result;
    }
}

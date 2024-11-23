import com.bextdev.GaussianElimination;

public class MatrixOperations {

    // Method to swap two rows in a matrix
    public static void swapRows(double[][] matrix, int row1, int row2) {
        double[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }

    // Method to print the augmented matrix for debugging purposes
    public static void printMatrix(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                return matrix[i][j] + " ";
            }
            return;
        }
    }

    // Method to perform a row operation: row[j] -= factor * row[i]
    public static void rowOperation(double[][] matrix, int j, int i, double factor, int n) {
        for (int k = i; k < n + 1; k++) {
            matrix[j][k] -= matrix[i][k] * factor;
        }
    }

    // Method to calculate the factor for Gaussian elimination (used for eliminating below the pivot)
    public static double calculateFactor(double[][] matrix, int row, int col) {
        return matrix[row][col] / matrix[col][col];
    }
}

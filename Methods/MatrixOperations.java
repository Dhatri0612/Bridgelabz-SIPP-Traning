import java.util.Random;

public class MatrixOperations {

    // 1. Generate a random matrix
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);  // values 0-9
        return matrix;
    }

    // 2. Transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }

    // 3. Determinant of 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // 4. Determinant of 3x3 matrix
    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
               m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
               m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // 5. Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] = m[0][0] / (double)det;
        return inv;
    }

    // 6. Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int r = 0;
                for (int k = 0; k < 3; k++) {
                    if (k == i) continue;
                    int c = 0;
                    for (int l = 0; l < 3; l++) {
                        if (l == j) continue;
                        minor[r][c] = m[k][l];
                        c++;
                    }
                    r++;
                }
                int sign = (i + j) % 2 == 0 ? 1 : -1;
                inv[j][i] = sign * determinant2x2(minor) / (double)det;
            }
        }
        return inv;
    }

    // 7. Display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row)
                System.out.printf("%.2f\t", value);
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + "\t");
            System.out.println();
        }
    }

    // Main
    public static void main(String[] args) {
        // 3x3 Matrix Example
        int[][] matrix3 = {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        };

        System.out.println("Original Matrix:");
        displayMatrix(matrix3);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix3));

        System.out.println("\nDeterminant (3x3): " + determinant3x3(matrix3));

        System.out.println("\nInverse (3x3):");
        double[][] inv3 = inverse3x3(matrix3);
        if (inv3 == null)
            System.out.println("Matrix is not invertible.");
        else
            displayMatrix(inv3);
    }
}

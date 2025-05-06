public class MatrixOperations {

    // Function to print a matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    // 1. Transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                result[j][i] = matrix[i][j];
        return result;
    }

    // 2. Determinant of a 3x3 matrix
    public static double determinant(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
               m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
               m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // 3. Inverse of a 3x3 matrix (if determinant ≠ 0)
    public static double[][] inverse(double[][] m) {
        double det = determinant(m);
        if (det == 0) {
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    public static void main(String[] args) {
        double[][] M = {
            {1, 2, 3},
            {4, 5, 4}, 
            {7, 8, 3}
        };

        System.out.println("Original Matrix:");
        printMatrix(M);

        // Transpose
        System.out.println("\n1. Transpose:");
        printMatrix(transpose(M));

        // Determinant
        double det = determinant(M);
        System.out.println("\n2. Determinant: " + det);

        // Inverse
        System.out.println("\n3. Inverse:");
        double[][] inv = inverse(M);
        if (inv == null) {
            System.out.println("Inverse does not exist (determinant is 0).");
        } else {
            printMatrix(inv);
        }
    }
}

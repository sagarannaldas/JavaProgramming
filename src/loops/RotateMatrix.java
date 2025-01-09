package loops;

public class RotateMatrix {
    public static void main(String []args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] rotatedmatrix = rotatematrix(matrix);
        System.out.println("Rotated matrix is:");
        //print matrix
        for (int i = 0; i < rotatedmatrix.length; i++) //rows
        {
            for(int j = 0; j < rotatedmatrix[i].length; j++) //columns
            {
                System.out.print(rotatedmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotatematrix(int[][] matrix) {
        int n = matrix.length;

        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) //rows
        {
            for(int j = 0; j < n; j++) //columns
            {
                //rotated[j][n-1-i] = matrix[i][j]; //clockwise rotation
                rotated[n-1-j][i] = matrix[i][j]; //anti-clockwise rotation
            }
        }
        return rotated;
    }
}

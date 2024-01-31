package TwoDArray;

public class Q9 {
   /* Anti-ClockWise rotation*/

    static void rotate(int [][] matrix ){
        int m= matrix.length;
        for (int i = 0; i < (m+1)/2; i++) {
            for (int j = 0; j < m / 2; j++) {

                // Start 4 way swaps

                // temp = bottom left
                int temp = matrix[m-1-j][i];

                // bottom left = bottom right
                matrix[m-1-j][i] = matrix[m-1-i][m-j-1];

                //bottom right = top right
                matrix[m-1-i][m-j-1] = matrix[j][m-1-i];

                // top right = top left
                matrix[j][m-1-i] = matrix[i][j];

                // top left = temp
                matrix[i][j] = temp;

            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                           {7,8,9},
                         };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);
        System.out.println("Matrix after Clockwise Rotation:");
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/**
                    सुना है उस के बदन की तराश ऐसी है
                    कि फूल अपनी क़बाएँ कतर के देखते हैं



 **/
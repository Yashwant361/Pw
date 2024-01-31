package TwoDArray;

public class Q6 {
    static void printRowCols(int[][] matrix, int rows, int cols) {
        // Check if the matrix has odd dimensions
        if (rows % 2 == 0 || cols % 2 == 0) {
            System.out.println("The matrix should have odd dimensions for a middle row and column.");
            return;
        }

        int middleRow = rows / 2;
        int middleCol = cols / 2;

        // Display middle row
        System.out.print("Middle Row: ");
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[middleRow][j] + " ");
        }
        System.out.println();

        // Display middle column
        System.out.print("Middle Column: ");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][middleCol] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
              int [][] matrix = {
                      {1,2,3,4,5},
                      {3,4,5,6,7},
                      {7,6,5,4,3},
                      {8,7,6,5,4},
                      {1,2,37,8,0},
              };
              int rows = 5;
              int cols = 5;
         printRowCols(matrix, rows, cols);
    }
}

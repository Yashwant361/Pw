package TwoDArray;

public class Q1 {

    static int[][] matrix(int row, int cols, int value) {
        int[][] arr = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = value;
            }
        }
        return arr;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] resultMatrix = matrix(5, 5, 10);
        printMatrix(resultMatrix);
    }
}

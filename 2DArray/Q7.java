package TwoDArray;

public class Q7 {
        public static void main(String[] args) {
            int[][] matrix = {{1, 1, 2, 2}, {1, 2, 2, 4}, {1, 2,
                    3, 4}, {1, 4, 1, 2}};
            int sum = 0;
            int col = matrix[0].length; // Indicate last element of matrix
            for (int row = 0; row < 4; row++) {
                sum = sum + matrix[row][col-1];
            }
            System.out.println(sum);
        }
    }

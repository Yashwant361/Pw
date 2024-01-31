package TwoDArray;

public class Q3 {

    static int sumRegion(int [][] matrix , int startI,int startJ,int endI,int endJ){
        int sum = 0;
        for (int i = startI; i <= endI ; i++) {
            for (int j = startJ ; j<=endJ ; j++){
                 sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int startI = 0, endI = 0; // Coordinates of the top-left corner
        int startJ = 1, endJ = 1; // Coordinates of the bottom-right corner

        int result = sumRegion(matrix, startI,startJ,endI,endJ);
        System.out.println("Sum of the rectangle: " + result );

    }
}

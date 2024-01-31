package TwoDArray;

public class Q8 {
    static void printDiagonal(int [][] matrix , int size){
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][size-1-i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      /*  int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };*/
        int[][] matrix = {
                {1,2},
                {6,7}};

        printDiagonal(matrix,2);
    }
}

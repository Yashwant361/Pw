package TwoDArray;

import java.util.Scanner;
import java.util.SortedMap;

public class Q2 {
    public static void main(String[] args) {
       int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
       int[][] matrix2 = {{4,5,8},{0,0,8},{1,2,0}};

       int rows = matrix1.length;
       int cols = matrix2[0].length;

       int [][] ansMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ansMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(ansMatrix[i][j] +" ");
            }
        System.out.println();
        }
    }
}


package TwoDArray;

import java.util.ArrayList;

public class Q5 {
    static ArrayList<Integer> colMaxSum(int[][] arr) {
        int idx = -1;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum +=arr[i][j];
            }
            if (maxSum < sum){
                maxSum = sum;

//                if (maxSumRowIndex != -1) {
//                    System.out.println("Row with the maximum sum: " + (maxSumRowIndex + 1));
//                } else {
//                    System.out.println("The matrix is empty.");
//                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(idx);
        res.add(maxSum);

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7}, {3,4,7,8}, {1,4,12,3}};
        System.out.print("Largest element is: " + colMaxSum(arr));
    }
}
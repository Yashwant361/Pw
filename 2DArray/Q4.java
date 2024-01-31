package TwoDArray;

public class Q4 {
    static int largestEle(int[][] arr){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max = Math.max(max,arr[i][j]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 55, 6},
                {7, 8, 9}
        };
        System.out.print("Largest element is: " +largestEle(arr));

    }
}

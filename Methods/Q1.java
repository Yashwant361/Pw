package Methods;

public class Q1 {
    public static void main(String[] args) {
        Square(5);
        printSquare(5);

    }
    public static void printSquare(int n){
        for (int i = 1; i <=n ; i++) {
            int sq = i*i;
            System.out.println("Square of " +i + " is:"  +sq);
        }
        System.out.println();
    }
    public  static void Square(int n ){
        int num = (int) Math.pow(n,2);
        System.out.println("Square of" + num +" is: " + num);
    }
}

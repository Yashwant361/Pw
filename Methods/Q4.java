package Methods;

public class Q4 {
    public static void main(String[] args) {

        count(5184);
    }
    public static void count(int n) {
        int count = 0;
        
        while (n != 0){
            int last_digit = n % 10;
            n = n / 10;
            count++;
        }
            int sq = (int) Math.pow(count, 2);

            System.out.println("Square of Count number " + count + "  is : " + sq);
    }
}

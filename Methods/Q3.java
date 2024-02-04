package Methods;

public class Q3 {
    public static void main(String[] args) {

        odd(1, 10);
    }

    public static void odd(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
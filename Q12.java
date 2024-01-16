package Pw.Assingment;

public class Q12 {
    public static void main(String[] args) {

        int num = 10 , firstTerm = 0 , secondTerm = 1;
        for (int i = 1; i <=num ; i++) {
            System.out.print("Fibonacci series"+firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

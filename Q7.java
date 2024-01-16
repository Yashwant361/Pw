package Pw.PracticeSet;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first and second number respectively:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        boolean areNumbersEqual = num1 == num2;
        boolean areNumberNotEqual = num1 != num2;
        boolean isFirstNumberGreater = num1 > num2;
        boolean isFirstNumberLess = num1 < num2;

        System.out.println("Are numbers equal? " + areNumbersEqual);
        System.out.println("Are numbers not equal? " + areNumberNotEqual);
        System.out.println("Is the first number greater? " + isFirstNumberGreater);
        System.out.println("Is the first number less?" + isFirstNumberLess);

    }
}

package Pw.Assingment;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three Number respectively");
        int num1= in.nextInt();
        int num2= in.nextInt();
        int num3= in.nextInt();

        in.close();

        int leastNumber;

        if (num1 <= num2 && num1 <= num2){
            leastNumber = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            leastNumber = num2;
        }else
            leastNumber = num3;
        System.out.println("The Least Number is " +leastNumber);
    }
}

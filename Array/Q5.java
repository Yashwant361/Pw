package Pw.Assingment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter three Number respectively");
        int num1= in.nextInt();
        int num2= in.nextInt();
        int num3= in.nextInt();
        if (num1 > num2){
            System.out.println(+ num3+ " Num1 is greater:" );
        }else if (num2 > num3)
            System.out.println(num3+ "Num2 is greater:" );
        else
            System.out.println(num3 + "Num3 is greater:" );
    }
}
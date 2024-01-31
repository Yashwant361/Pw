package Pw.Assingment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the cost price");
        int costPrice = in.nextInt();
        System.out.println("Enter the selling price");
        int sellingPrice = in.nextInt();

        in.close();

        double profitorloss = costPrice - sellingPrice;

        if (profitorloss > 0 ){
            System.out.println(profitorloss);
        } else if (profitorloss < 0) {
            System.out.println(Math.abs(profitorloss));
        }else
            System.out.println("Break-even, no profit or loss");

    }
}

package Pw.PracticeSet;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        double AreaOfCircle;
        double pi = 3.14;
        double SimpleInterest;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        AreaOfCircle = pi * Math.pow(radius, 2);
        System.out.println("Area of Circle: " +AreaOfCircle);


        if (AreaOfCircle == AreaOfCircle) {

            System.out.print("Enter principal amount:");
            int principalAmount = sc.nextInt();
            System.out.print("rate of interest");
            int rate = sc.nextInt();
            System.out.print("Enter time (in years):");
            int time = sc.nextInt();

            SimpleInterest = principalAmount *  rate * time/100.0;
            System.out.print("Simple Interest: "+SimpleInterest);
        }
        else
            System.out.print("Area does not match the expected value.");
    }
}

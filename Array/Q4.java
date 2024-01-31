package Pw.Assingment;

public class Q4 {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = isLeapYear(2024);

        if (isLeapYear){
            System.out.println("Leap Year");
        }else
            System.out.println("Not a Leap Year");
    }
    static boolean isLeapYear(int  year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

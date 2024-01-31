package Pw.Assingment;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        int sideA = scanner.nextInt();

        System.out.print("Enter the length of side B: ");
        int sideB = scanner.nextInt();

        System.out.print("Enter the length of side C: ");
        int sideC = scanner.nextInt();

        scanner.close();

        // Check and print the type of the triangle
        checkTriangleType(sideA, sideB, sideC);
    }

    static void checkTriangleType(int sideA, int sideB, int sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Invalid triangle sides. Each side must be greater than 0.");
            return;
        }

        if (sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB) {
            System.out.println("Not a valid triangle. The sum of any two sides must be greater than the third side.");
            return;
        }

        if (sideA == sideB && sideB == sideC) {
            System.out.println("Equilateral Triangle");
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}


package Pw.Assingment;

import java.util.Locale;

public class Q11 {
    public static void main(String[] args) {
        String name = "Physics Wallah";

        if (isPalindrome(name)){
            System.out.println(name+ " String is palindrome");
        }
        else
            System.out.println(name + " String is not palindrome");
    }

    static boolean isPalindrome(String name) {
        name = name.toLowerCase().replace("[^a-zA-Z0-9]","");
        String reversed = new  StringBuilder(name).reverse().toString();
        return name.equals(reversed);
}
}

# Java Program to find whether the given number is 3 digit number or not

import java.util.Scanner;

public class ThreeDigitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println("Three digit number");
        } else {
            System.out.println("Not a three digit number");
        }
        
        scanner.close();
    }
}

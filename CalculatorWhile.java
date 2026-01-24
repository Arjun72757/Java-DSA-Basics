package LOOP;

import java.util.Scanner;

public class CalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;

        while (choice != 0) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Addition = " + (a + b));
                } 
                else if (choice == 2) {
                    System.out.println("Subtraction = " + (a - b));
                } 
                else if (choice == 3) {
                    System.out.println("Multiplication = " + (a * b));
                } 
                else if (choice == 4) {
                    if (b != 0) {
                        System.out.println("Division = " + (a / b));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                }
            } 
            else if (choice != 0) {
                System.out.println("Invalid choice! Try again.");
            }
        }

        System.out.println("Program Ended.");
        sc.close();
    }
}

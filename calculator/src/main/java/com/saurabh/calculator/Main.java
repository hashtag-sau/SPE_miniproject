package com.saurabh.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            printMenu();
            System.out.print("Enter your choice: ");

            // Ensure we read an integer input
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number for square root: ");
                    double num = scanner.nextDouble();
                    System.out.println("Square root of " + num + " is: " + MathOperations.squareRoot(num));
                    break;

                case 2:
                    System.out.print("Enter number for factorial: ");
                    int factNum = scanner.nextInt();
                    System.out.println("Factorial of " + factNum + " is: " + MathOperations.factorial(factNum));
                    break;

                case 3:
                    System.out.print("Enter number for natural log: ");
                    double lnNum = scanner.nextDouble();
                    try {
                        System.out.println("Natural log of " + lnNum + " is: " + MathOperations.naturalLog(lnNum));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power " + exponent + " is: " + MathOperations.power(base, exponent));
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();  // Blank line for readability
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("========== Scientific Calculator ==========");
        System.out.println("1. Square Root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural Logarithm");
        System.out.println("4. Power Function");
        System.out.println("5. Exit");
        System.out.flush(); //fixes for displaying the menu when attach to docker 
        
    }

}

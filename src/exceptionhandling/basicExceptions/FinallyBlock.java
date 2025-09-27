package exceptionhandling.basicExceptions;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scan.nextInt();

            int result = 100 / number;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Division operation complete (finally block executed).");
        }

        System.out.println("Program continues after try-catch-finally...");
    }
}

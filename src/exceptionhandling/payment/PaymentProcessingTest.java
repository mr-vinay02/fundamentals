package exceptionhandling.payment;

import java.util.Scanner;


public class PaymentProcessingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 16-digit card number: ");
        String cardNumber = scanner.nextLine();

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();

        ProcessProcessingSystem paymentSystem = new ProcessProcessingSystem();

        try {
            paymentSystem.processPayment(cardNumber, amount);
        } catch (InvalidPaymentDetailsException e) {
            // Unchecked exception handling
            System.err.println("Invalid Payment Details: " + e.getMessage());

        } catch (PaymentFailedException e) {
            // Checked exception handling
            System.err.println(" Payment Failed: " + e.getMessage());

        } catch (Exception e) {
            // Any unexpected errors
            System.err.println(" Unexpected Error: " + e.getMessage());

        }

        scanner.close();
    }
}

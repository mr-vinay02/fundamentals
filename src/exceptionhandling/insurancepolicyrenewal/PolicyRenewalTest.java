package exceptionhandling.insurancepolicyrenewal;

import java.util.Scanner;

public class PolicyRenewalTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is policy active? (true/false): ");
        boolean isPolicyActive = scanner.nextBoolean();

        System.out.print("Is payment cleared? (true/false): ");
        boolean isPaymentCleared = scanner.nextBoolean();

        System.out.print("Is policyholder compliant? (true/false): ");
        boolean isCompliant = scanner.nextBoolean();

        PolicyRenewal renewal = new PolicyRenewal(isPolicyActive, isPaymentCleared, isCompliant);

        try {
            renewal.renewPolicy();
        } catch (PolicyExpiredException | NonComplianceException e) {
            System.err.println(" Renewal Failed: " + e.getMessage());
        } catch (PaymentPendingException e) {
            System.err.println(" Renewal Failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(" Unexpected Error: " + e.getMessage());
        }

        scanner.close();
    }
}

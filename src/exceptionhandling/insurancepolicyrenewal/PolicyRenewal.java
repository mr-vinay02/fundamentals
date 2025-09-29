package exceptionhandling.insurancepolicyrenewal;

public class PolicyRenewal {

    private boolean isPolicyActive;
    private boolean isPaymentCleared;
    private boolean isCompliant;

    public PolicyRenewal(boolean isPolicyActive, boolean isPaymentCleared, boolean isCompliant) {
        this.isPolicyActive = isPolicyActive;
        this.isPaymentCleared = isPaymentCleared;
        this.isCompliant = isCompliant;
    }

    public void renewPolicy() throws PolicyExpiredException, PaymentPendingException, NonComplianceException {
        if (!isPolicyActive) {
            throw new PolicyExpiredException("Policy has expired and cannot be renewed.");
        }
        if (!isPaymentCleared) {
            throw new PaymentPendingException("Payment is pending. Please clear dues before renewal.");
        }
        if (!isCompliant) {
            throw new NonComplianceException("Policyholder is not compliant with renewal terms.");
        }

        System.out.println("Policy renewed successfully!");
    }

}

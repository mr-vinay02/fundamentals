package exceptionhandling.insurancepolicyrenewal;

public class PaymentPendingException extends Exception{

    public PaymentPendingException(String message) {
        super(message);
    }

}

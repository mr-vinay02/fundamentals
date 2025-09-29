package exceptionhandling.insurancepolicyrenewal;

public class NonComplianceException extends Exception{

    public NonComplianceException(String message) {
        super(message);
    }

}

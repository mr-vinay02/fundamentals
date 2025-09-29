package exceptionhandling.insurancepolicyrenewal;

public class PolicyExpiredException extends Exception{

    public PolicyExpiredException(String message) {
        super(message);
    }

}

package exceptionhandling.customexception.ageexception;

public class InvalidAgeException extends Exception{

    public InvalidAgeException(String message) {
        super(message);
    }
}

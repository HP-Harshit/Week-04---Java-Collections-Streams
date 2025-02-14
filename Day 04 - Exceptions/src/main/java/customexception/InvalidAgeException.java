package customexception;

// Custom exception class for invalid age
public class InvalidAgeException extends Exception {
    // Constructor for InvalidAgeException
    public InvalidAgeException(String message) {
        super(message);
    }
}
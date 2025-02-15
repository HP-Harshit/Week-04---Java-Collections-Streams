package problemsofjunit.advancejunitpracticeproblems.testinguserregistration;

public class UserRegistration {
    // Main method to demonstrate user registration
    public static void main(String[] args) {
        try {
            registerUser("Alice", "alice@example.com", "Password123");
            System.out.println("User registered successfully.");
        } catch (IllegalArgumentException e) {
            System.err.println("Registration failed: " + e.getMessage());
        }
    }

    // Method to register a user
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must have at least 8 characters, one uppercase letter, and one digit.");
        }
    }
}

package problemsofjunit.advancejunitpracticeproblems.testingpasswordvalidator;

public class PasswordValidator {
    // Main method to demonstrate password validation
    public static void main(String[] args) {
        // Test passwords
        String[] passwords = {"Password1", "StrongPass123", "Secure123A", "Pass1", "password1", "Password"};

        for (String password : passwords) {
            System.out.println("Is \"" + password + "\" a valid password? " + isValid(password));
        }
    }

    // Method to validate password strength
    public static boolean isValid(String password) {
        // Check if password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Check for uppercase letter and digit
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasDigit;
    }
}

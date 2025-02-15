package problemsofjunit.advancejunitpracticeproblems.testingpasswordvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValid("Password1"));
        assertTrue(PasswordValidator.isValid("StrongPass123"));
        assertTrue(PasswordValidator.isValid("Secure123A"));
    }

    @Test
    void testInvalidPasswords() {
        // Passwords with fewer than 8 characters
        assertFalse(PasswordValidator.isValid("Pass1"));
        assertFalse(PasswordValidator.isValid("Short1A"));

        // Passwords without an uppercase letter
        assertFalse(PasswordValidator.isValid("password1"));
        assertFalse(PasswordValidator.isValid("strongpass123"));

        // Passwords without a digit
        assertFalse(PasswordValidator.isValid("Password"));
        assertFalse(PasswordValidator.isValid("StrongPass"));
    }
}

package problemsofjunit.advancejunitpracticeproblems.testinguserregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("john_doe", "john@example.com", "Password123"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "john@example.com", "Password123"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("john_doe", "johnexample.com", "Password123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("john_doe", "john@example.com", "password"));
    }
}

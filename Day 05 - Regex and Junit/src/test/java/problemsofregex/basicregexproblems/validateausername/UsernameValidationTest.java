package problemsofregex.basicregexproblems.validateausername;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsernameValidationTest {
    // Test method to check valid usernames
    @Test
    void testValidUsernames() {
        // Assert that a valid username "user_123" returns true
        assertTrue(UsernameValidation.isValidUsername("user_123"));

        // Assert that a valid username "Valid_User01" returns true
        assertTrue(UsernameValidation.isValidUsername("Valid_User01"));

        // Assert that a valid username "username123" returns true
        assertTrue(UsernameValidation.isValidUsername("username123"));
    }

    // Test method to check invalid usernames
    @Test
    void testInvalidUsernames() {
        // Assert that an invalid username "123user" (starts with a number) returns false
        assertFalse(UsernameValidation.isValidUsername("123user")); // Starts with a number

        // Assert that an invalid username "us" (too short) returns false
        assertFalse(UsernameValidation.isValidUsername("us")); // Too short

        // Assert that an invalid username "user!" (contains special character) returns false
        assertFalse(UsernameValidation.isValidUsername("user!")); // Contains special character

        // Assert that an invalid username "user_with_a_very_long_name" (too long) returns false
        assertFalse(UsernameValidation.isValidUsername("user_with_a_very_long_name")); // Too long
    }
}

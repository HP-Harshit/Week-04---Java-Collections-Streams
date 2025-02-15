package problemsofregex.basicregexproblems.validatealicenseplatenumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LicensePlateValidationTest {

    // Test method to check valid license plates
    @Test
    void testValidLicensePlates() {
        // Assert that a valid license plate "AB1234" returns true
        assertTrue(LicensePlateValidation.isValidLicensePlate("AB1234"));

        // Assert that a valid license plate "CD5678" returns true
        assertTrue(LicensePlateValidation.isValidLicensePlate("CD5678"));
    }

    // Test method to check invalid license plates
    @Test
    void testInvalidLicensePlates() {
        // Assert that an invalid license plate "A12345" (too few letters) returns false
        assertFalse(LicensePlateValidation.isValidLicensePlate("A12345")); // Too few letters

        // Assert that an invalid license plate "Ab1234" (lowercase letter) returns false
        assertFalse(LicensePlateValidation.isValidLicensePlate("Ab1234")); // Lowercase letter

        // Assert that an invalid license plate "AB123" (too few digits) returns false
        assertFalse(LicensePlateValidation.isValidLicensePlate("AB123"));  // Too few digits

        // Assert that an invalid license plate "1234AB" (digits before letters) returns false
        assertFalse(LicensePlateValidation.isValidLicensePlate("1234AB")); // Digits before letters

        // Assert that an invalid license plate "AB12345" (too many digits) returns false
        assertFalse(LicensePlateValidation.isValidLicensePlate("AB12345")); // Too many digits
    }
}

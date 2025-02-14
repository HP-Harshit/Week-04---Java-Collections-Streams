package customexception;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UserDefinedExceptionTest {

    @Test
    public void testValidateAge_ValidAge() {
        // Test case: Valid age (18 or above)
        assertDoesNotThrow(() -> UserDefinedException.validateAge(18), "Age 18 or above should not throw an exception.");
    }

    @Test
    public void testValidateAge_InvalidAge() {
        // Test case: Invalid age (below 18)
        assertThrows(InvalidAgeException.class, () -> UserDefinedException.validateAge(17), "Age below 18 should throw InvalidAgeException.");
    }
}

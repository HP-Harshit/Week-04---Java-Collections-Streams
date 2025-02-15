package problemsofjunit.basicjunitpracticeproblems.testingexceptionhandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    private ExceptionHandling exceptionHandling;

    // Setup method to initialize the ExceptionHandling object before each test
    @BeforeEach
    void setup() {
        exceptionHandling = new ExceptionHandling();
    }

    // Test method for valid division
    @Test
    void divideTest_Valid() {
        // Ensure no exception is thrown for valid division
        assertDoesNotThrow(() -> exceptionHandling.divide(5, 2));
        // Check if the division result is correct
        assertEquals(2, exceptionHandling.divide(5, 2));
    }

    // Test method for invalid division (division by zero)
    @Test
    void divideTest_Invalid() {
        // Ensure ArithmeticException is thrown for division by zero
        assertThrows(ArithmeticException.class, () -> exceptionHandling.divide(5, 0));
    }
}

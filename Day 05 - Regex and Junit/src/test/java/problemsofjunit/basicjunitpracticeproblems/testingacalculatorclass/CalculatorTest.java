package problemsofjunit.basicjunitpracticeproblems.testingacalculatorclass;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;

    // Setup method to initialize the Calculator object before each test
    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    // Test method for the add method
    @Test
    void addTest() {
        assertEquals(7, calc.add(4, 3));
    }

    // Test method for the subtract method
    @Test
    void subtractTest() {
        assertEquals(1, calc.subtract(4, 3));
    }

    // Test method for the multiply method
    @Test
    void multiply() {
        assertEquals(12, calc.multiply(4, 3));
    }

    // Test method for the divide method with valid input
    @Test
    void divideTest_Valid() {
        assertEquals(1, calc.divide(4, 3));
        // Ensure no exception is thrown for valid division
        assertDoesNotThrow(() -> calc.divide(4, 3));
    }

    // Test method for the divide method with invalid input (division by zero)
    @Test
    void divideTest_Invalid() {
        // Ensure IllegalArgumentException is thrown for division by zero
        assertThrows(IllegalArgumentException.class, () -> calc.divide(4, 0));
    }
}

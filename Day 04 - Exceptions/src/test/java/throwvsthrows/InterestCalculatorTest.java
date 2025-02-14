package throwvsthrows;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InterestCalculatorTest {

    @Test
    public void testCalculateInterest_ValidInput() {
        // Test case: Valid input
        assertDoesNotThrow(() -> {
            double result = InterestCalculator.calculateInterest(1000, 5, 10);
            assertEquals(500.0, result,  "Calculated interest should be 500.0");
        }, "Valid input should not throw any exception.");
    }

    @Test
    public void testCalculateInterest_NegativeAmount() {
        // Test case: Negative amount
        assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(-1000, 5, 10);
        }, "Negative amount should throw IllegalArgumentException.");
    }

    @Test
    public void testCalculateInterest_NegativeRate() {
        // Test case: Negative rate
        assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(1000, -5, 10);
        }, "Negative rate should throw IllegalArgumentException.");
    }
}

package problemsofjunit.basicjunitpracticeproblems.testingparameterizedtests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTest {
    // Test method to verify that isEven returns true for even numbers
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEven_True(int number) {
        assertTrue(Parameterized.isEven(number));
    }

    // Test method to verify that isEven returns false for odd numbers
    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEven_False(int number) {
        assertFalse(Parameterized.isEven(number));
    }
}

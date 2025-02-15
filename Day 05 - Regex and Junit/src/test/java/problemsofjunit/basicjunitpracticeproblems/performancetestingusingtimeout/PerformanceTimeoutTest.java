package problemsofjunit.basicjunitpracticeproblems.performancetestingusingtimeout;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTimeoutTest {
    // Test method to verify that the longRunningTask method completes within 2 seconds
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask() {
        // Call the longRunningTask method
        long result = PerformanceTimeout.longRunningTask();
        // Assert that the result is not zero (indicating the task completed)
        assertNotEquals(0, result);
    }
}

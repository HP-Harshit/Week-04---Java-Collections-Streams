package annotations.advancedlevel.customcachingsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CacheHandlerTest {

    @Test
    public void testCacheHandler() throws Exception {
        ExpensiveService service = new ExpensiveService();

        // First call to computeSquare(5)
        long startTime = System.nanoTime();
        int result1 = (int) CacheHandler.invokeMethod(service, "computeSquare", 5);
        long endTime = System.nanoTime();
        long duration1 = endTime - startTime;

        // Second call to computeSquare(5), should return cached result
        startTime = System.nanoTime();
        int result2 = (int) CacheHandler.invokeMethod(service, "computeSquare", 5);
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;

        // Verify the results are equal and the cached call is faster
        assertEquals(25, result1);
        assertEquals(25, result2);
        assert(duration2 < duration1);

        // First call to computeSquare(6)
        startTime = System.nanoTime();
        int result3 = (int) CacheHandler.invokeMethod(service, "computeSquare", 6);
        endTime = System.nanoTime();
        long duration3 = endTime - startTime;

        // Second call to computeSquare(6), should return cached result
        startTime = System.nanoTime();
        int result4 = (int) CacheHandler.invokeMethod(service, "computeSquare", 6);
        endTime = System.nanoTime();
        long duration4 = endTime - startTime;

        // Verify the results are equal and the cached call is faster
        assertEquals(36, result3);
        assertEquals(36, result4);
        assert(duration4 < duration3);
    }
}

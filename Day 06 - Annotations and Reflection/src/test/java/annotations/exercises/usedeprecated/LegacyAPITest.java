package annotations.exercises.usedeprecated;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LegacyAPITest {

    @Test
    public void testOldFeature() throws NoSuchMethodException {
        LegacyAPI api = new LegacyAPI(); // Create an instance of LegacyAPI

        // This test will pass if the method is marked as deprecated
        boolean isDeprecated = api.getClass().getMethod("oldFeature").isAnnotationPresent(Deprecated.class);
        // Check if oldFeature() is annotated with @Deprecated
        assertTrue(isDeprecated);
    }

    @Test
    public void testNewFeature() {
        LegacyAPI api = new LegacyAPI(); // Create an instance of LegacyAPI

        // Capture the output of newFeature() method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the newFeature() method
        api.newFeature();

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "This is the new feature."; // Expected output
        Assertions.assertEquals(expectedOutput, outContent.toString().trim()); // Compare the output with expected
    }
}

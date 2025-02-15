package problemsofregex.replaceandmodifystrings.replacemulitplespaceswithasinglespace;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReplaceSpacesTest {

    // Test method to check replacing multiple spaces
    @Test
    void testReplaceMultipleSpaces() {
        // Define the text to test
        String text = "This   is an     example with   multiple     spaces.";
        // Define the expected formatted text
        String expectedText = "This is an example with multiple spaces.";

        // Replace multiple spaces in the text
        String formattedText = ReplaceSpaces.replaceMultipleSpaces(text);

        // Assert that the formatted text matches the expected text
        assertEquals(expectedText, formattedText);
    }
}

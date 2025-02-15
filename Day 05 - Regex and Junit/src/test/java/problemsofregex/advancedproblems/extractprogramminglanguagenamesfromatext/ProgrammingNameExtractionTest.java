package problemsofregex.advancedproblems.extractprogramminglanguagenamesfromatext;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProgrammingNameExtractionTest {

    // Test method to check valid extraction of programming language names
    @Test
    void testProgrammingLanguageExtraction() {
        // Define the text to test
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        // List of expected programming language names
        List<String> expectedLanguages = List.of("Java", "Python", "JavaScript", "Go");

        // Extract programming language names from the text
        List<String> extractedLanguages = ProgrammingNameExtraction.extractProgrammingLanguages(text);

        // Assert that the extracted programming language names match the expected names
        assertEquals(expectedLanguages, extractedLanguages);
    }

    // Test method to check extraction with no programming language names
    @Test
    void testNoProgrammingLanguages() {
        // Define the text to test
        String text = "I love cooking and reading books.";
        // Empty list of expected programming language names
        List<String> expectedLanguages = List.of();

        // Extract programming language names from the text
        List<String> extractedLanguages = ProgrammingNameExtraction.extractProgrammingLanguages(text);

        // Assert that the extracted programming language names match the expected names (empty list)
        assertEquals(expectedLanguages, extractedLanguages);
    }
}

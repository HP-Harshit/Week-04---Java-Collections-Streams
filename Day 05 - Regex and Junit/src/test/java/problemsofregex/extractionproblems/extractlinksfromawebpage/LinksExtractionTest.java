package problemsofregex.extractionproblems.extractlinksfromawebpage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LinksExtractionTest {

    // Test method to check valid extraction of URLs
    @Test
    void testLinkExtraction() {
        // Define the text to test
        String text = "Visit https://www.google.com and http://example.org for more info.";
        // List of expected URLs
        List<String> expectedLinks = List.of("https://www.google.com", "http://example.org");

        // Extract URLs from the text
        List<String> extractedLinks = LinksExtraction.extractLinks(text);

        // Assert that the extracted URLs match the expected URLs
        assertEquals(expectedLinks, extractedLinks);
    }

    // Test method to check extraction with no URLs
    @Test
    void testNoLinks() {
        // Define the text to test
        String text = "There are no links in this text.";
        // Empty list of expected URLs
        List<String> expectedLinks = List.of();

        // Extract URLs from the text
        List<String> extractedLinks = LinksExtraction.extractLinks(text);

        // Assert that the extracted URLs match the expected URLs (empty list)
        assertEquals(expectedLinks, extractedLinks);
    }

    // Test method to check extraction with invalid URLs
    @Test
    void testInvalidLinks() {
        // Define the text to test
        String text = "Invalid URLs: htt://example, www.example.com";
        // Empty list of expected URLs
        List<String> expectedLinks = List.of();

        // Extract URLs from the text
        List<String> extractedLinks = LinksExtraction.extractLinks(text);

        // Assert that the extracted URLs match the expected URLs (empty list)
        assertEquals(expectedLinks, extractedLinks);
    }
}

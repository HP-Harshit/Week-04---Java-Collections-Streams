package problemsofregex.extractionproblems.extractlinksfromawebpage;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class LinksExtraction {
    // Main method to demonstrate link extraction
    public static void main(String[] args) {
        // Define the text containing the URLs
        String text = "Websites: https://www.google.com, http://example.org, and https://github.com";

        // Extract and print URLs from the text
        List<String> links = extractLinks(text);
        for (String link : links) {
            System.out.println("URL: " + link);
        }
    }

    // Method to extract URLs from the given text
    public static List<String> extractLinks(String text) {
        // Define the regular expression for matching URLs
        String regex = "https?://(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the given text
        Matcher matcher = pattern.matcher(text);

        // List to store found URLs
        List<String> links = new ArrayList<>();

        // Iterate through the found matches
        while (matcher.find()) {
            // Add the matched URL to the list
            links.add(matcher.group());
        }

        return links;
    }
}

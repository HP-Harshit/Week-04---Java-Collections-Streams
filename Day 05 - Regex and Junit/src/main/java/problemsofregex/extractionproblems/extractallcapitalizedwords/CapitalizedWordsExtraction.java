package problemsofregex.extractionproblems.extractallcapitalizedwords;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CapitalizedWordsExtraction {
    // Main method to demonstrate extraction of capitalized words
    public static void main(String[] args) {
        // Define the text containing the capitalized words
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Extract and print capitalized words from the text
        List<String> words = extractCapitalizedWords(text);
        for (String word : words) {
            System.out.println("Word found: " + word);
        }
    }

    // Method to extract capitalized words from the given text
    public static List<String> extractCapitalizedWords(String text) {
        // Define the regular expression for matching capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the given text
        Matcher matcher = pattern.matcher(text);

        // List to store found capitalized words
        List<String> words = new ArrayList<>();

        // Iterate through the found matches
        while (matcher.find()) {
            // Add the matched word to the list
            words.add(matcher.group());
        }

        return words;
    }
}

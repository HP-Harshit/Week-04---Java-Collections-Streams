package problemsofregex.advancedproblems.findrepeatingwordsinasentence;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class FindRepeatingWords {
    // Main method to demonstrate finding repeating words
    public static void main(String[] args) {
        // Define the text containing repeating words
        String text = "This is is a repeated repeated word test.";

        // Extract and print repeating words from the text
        List<String> repeatingWords = findRepeatingWords(text);
        for (String word : repeatingWords) {
            System.out.println("Repeating word: " + word);
        }
    }

    // Method to find repeating words in the given text
    public static List<String> findRepeatingWords(String text) {
        // Define the regular expression for finding repeating words
        String regex = "\\b(\\w+)\\s+\\1\\b";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the given text
        Matcher matcher = pattern.matcher(text);

        // List to store found repeating words
        List<String> repeatingWords = new ArrayList<>();

        // Iterate through the found matches
        while (matcher.find()) {
            // Add the matched repeating word to the list
            repeatingWords.add(matcher.group(1));
        }

        return repeatingWords;
    }
}

package problemsofregex.advancedproblems.extractprogramminglanguagenamesfromatext;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingNameExtraction {
    // Main method to demonstrate extracting programming language names
    public static void main(String[] args) {
        // Define the text containing the programming language names
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Extract and print programming language names from the text
        List<String> languages = extractProgrammingLanguages(text);
        for (String lang : languages) {
            System.out.println("Language found: " + lang);
        }
    }

    // Method to extract programming language names from the given text
    public static List<String> extractProgrammingLanguages(String text) {
        // Define the list of programming language names to extract
        String[] programmingLanguages = {"Java", "Python", "JavaScript", "Go"};

        // List to store found programming language names
        List<String> languages = new ArrayList<>();

        // Iterate through each programming language name
        for (String lang : programmingLanguages) {
            // Define the regular expression for matching the programming language name
            String regex = "\\b" + Pattern.quote(lang) + "\\b";

            // Compile the regular expression into a pattern
            Pattern pattern = Pattern.compile(regex);

            // Match the pattern against the given text
            Matcher matcher = pattern.matcher(text);

            // Check if the pattern matches and add the matched programming language name to the list
            if (matcher.find()) {
                languages.add(matcher.group());
            }
        }

        return languages;
    }
}

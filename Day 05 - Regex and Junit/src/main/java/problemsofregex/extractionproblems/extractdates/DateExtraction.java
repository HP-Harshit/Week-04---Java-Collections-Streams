package problemsofregex.extractionproblems.extractdates;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class DateExtraction {
    // Main method to demonstrate date extraction
    public static void main(String[] args) {
        // Define the text containing the dates
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Extract and print dates from the text
        List<String> dates = extractDates(text);
        for (String date : dates) {
            System.out.println("Date found: " + date);
        }
    }

    // Method to extract dates from the given text
    public static List<String> extractDates(String text) {
        // Define the regular expression for matching dates in dd/mm/yyyy format
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the given text
        Matcher matcher = pattern.matcher(text);

        // List to store found dates
        List<String> dates = new ArrayList<>();

        // Iterate through the found matches
        while (matcher.find()) {
            // Add the matched date to the list
            dates.add(matcher.group());
        }

        return dates;
    }
}

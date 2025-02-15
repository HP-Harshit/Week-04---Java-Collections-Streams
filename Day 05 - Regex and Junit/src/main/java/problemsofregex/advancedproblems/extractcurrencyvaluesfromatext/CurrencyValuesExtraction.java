package problemsofregex.advancedproblems.extractcurrencyvaluesfromatext;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyValuesExtraction {
    // Main method to demonstrate currency value extraction
    public static void main(String[] args) {
        // Define the text containing currency values
        String text = "The price is $45.99, and the discount is 10.50.";

        // Extract and print currency values from the text
        List<String> currencyValues = extractCurrencyValues(text);
        for (String value : currencyValues) {
            System.out.println("Currency found: " + value);
        }
    }

    // Method to extract currency values from the given text
    public static List<String> extractCurrencyValues(String text) {
        // Define the regular expression for matching currency values
        String regex = "\\$?\\d+(\\.\\d{2})?";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the given text
        Matcher matcher = pattern.matcher(text);

        // List to store found currency values
        List<String> currencyValues = new ArrayList<>();

        // Iterate through the found matches
        while (matcher.find()) {
            // Add the matched currency value to the list
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }
}

package problemsofregex.advancedproblems.validateacreditcardnumber;

import java.util.regex.*;

public class CreditCardValidation {
    // Main method to demonstrate credit card validation
    public static void main(String[] args) {
        // Define the list of credit card numbers to validate
        String[] cardNumbers = {"4111111111111111", "5500000000000004", "1234567890123456"};

        // Iterate through the card numbers and validate each one
        for (String cardNumber : cardNumbers) {
            // Validate the credit card number and print the result
            System.out.println(cardNumber + " is valid: " + validateCreditCard(cardNumber));
        }
    }

    // Method to validate a credit card number
    public static boolean validateCreditCard(String cardNumber) {
        // Define the regular expression for validating Visa card numbers
        String visaRegex = "^4[0-9]{15}$";

        // Define the regular expression for validating MasterCard numbers
        String masterCardRegex = "^5[0-9]{15}$";

        // Compile the regular expressions into patterns
        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterCardPattern = Pattern.compile(masterCardRegex);

        // Check if the card number matches Visa pattern or MasterCard pattern
        return visaPattern.matcher(cardNumber).matches() || masterCardPattern.matcher(cardNumber).matches();
    }
}

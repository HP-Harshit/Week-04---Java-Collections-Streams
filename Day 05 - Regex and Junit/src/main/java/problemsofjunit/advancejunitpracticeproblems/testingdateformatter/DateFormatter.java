package problemsofjunit.advancejunitpracticeproblems.testingdateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    // Main method to demonstrate date formatting
    public static void main(String[] args) {
        String inputDate = "2021-07-21";
        try {
            String formattedDate = formatDate(inputDate);
            System.out.println("Formatted date: " + formattedDate);
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format: " + e.getMessage());
        }
    }

    // Method to convert yyyy-MM-dd format to dd-MM-yyyy
    public static String formatDate(String inputDate) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(inputDate, inputFormatter);
        return date.format(outputFormatter);
    }
}

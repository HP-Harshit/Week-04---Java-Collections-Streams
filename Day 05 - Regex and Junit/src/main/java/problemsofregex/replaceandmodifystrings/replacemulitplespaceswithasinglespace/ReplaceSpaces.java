package problemsofregex.replaceandmodifystrings.replacemulitplespaceswithasinglespace;

public class ReplaceSpaces {
    // Main method to demonstrate replacing multiple spaces with a single space
    public static void main(String[] args) {
        // Define the text containing multiple spaces
        String text = "This   is an     example with   multiple     spaces.";

        // Replace multiple spaces with a single space
        String replacedText = replaceMultipleSpaces(text);

        // Print the original text
        System.out.println("Original: " + text);

        // Print the formatted text
        System.out.println("Formatted: " + replacedText);
    }

    // Method to replace multiple spaces with a single space
    public static String replaceMultipleSpaces(String text) {
        // Replace multiple spaces with a single space
        return text.replaceAll("\\s+", " ");
    }
}

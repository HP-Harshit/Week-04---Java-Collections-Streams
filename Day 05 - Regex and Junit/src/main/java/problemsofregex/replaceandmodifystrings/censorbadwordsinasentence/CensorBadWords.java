package problemsofregex.replaceandmodifystrings.censorbadwordsinasentence;

import java.util.regex.*;

public class CensorBadWords {
    // Main method to demonstrate censoring bad words
    public static void main(String[] args) {
        // Define the sentence containing bad words
        String sentence = "This is a damn bad example with some stupid words.";

        // Define the list of bad words to censor
        String[] badWords = {"damn", "stupid"};

        // Censor bad words in the sentence
        String censoredSentence = censorBadWords(sentence, badWords);

        // Print the censored sentence
        System.out.println("Censored: " + censoredSentence);
    }

    // Method to censor bad words in the given sentence
    public static String censorBadWords(String sentence, String[] badWords) {
        // Iterate through each bad word and replace it with "****"
        for (String badWord : badWords) {
            // Create a regex pattern for the bad word
            String regex = "\\b" + Pattern.quote(badWord) + "\\b";
            // Replace the bad word with "****"
            sentence = sentence.replaceAll(regex, "****");
        }
        return sentence;
    }
}

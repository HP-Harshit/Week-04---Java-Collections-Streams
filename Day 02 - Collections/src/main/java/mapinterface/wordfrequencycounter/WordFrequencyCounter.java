package mapinterface.wordfrequencycounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Path to the input text file
        String filePath = "wordCounter.txt";

        // Count word frequency
        Map<String, Integer> freqCount = countFrequency(filePath);

        // Print the word frequency map
        System.out.println(freqCount);
    }

    // Method to read words from a file and return them as a list
    public static List<String> getWords(String filePath){
        // Create a list to hold the words
        List<String> words = new ArrayList<>();
        try(BufferedReader bfr = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = bfr.readLine()) != null){
                // Remove punctuation and convert to lowercase
                line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

                // Split the line into words and add them to the list
                words.addAll(List.of(line.split("\\s+")));
            }
        } catch (IOException e){
            // Handle any IO exceptions
            e.printStackTrace();
        }
        // Return the list of words
        return words;
    }

    // Method to count the frequency of words in a file
    public static Map<String, Integer> countFrequency(String filePath){
        // Get words from the file
        List<String> words = getWords(filePath);

        // Create a map to hold the frequency count
        Map<String, Integer> freqCount = new HashMap<>();

        for(String word : words){
            // Update the frequency count for each word
            freqCount.put(word, freqCount.getOrDefault(word, 0) + 1);
        }

        // Return the frequency map
        return freqCount;
    }
}

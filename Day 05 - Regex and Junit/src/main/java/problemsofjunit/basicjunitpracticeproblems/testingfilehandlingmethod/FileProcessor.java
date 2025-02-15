package problemsofjunit.basicjunitpracticeproblems.testingfilehandlingmethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {
    // Main method to demonstrate file operations
    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "Hello, World!";

        try {
            // Write content to the file
            writeToFile(filename, content);
            System.out.println("Content written to file.");

            // Check if the file exists
            if (fileExists(filename)) {
                System.out.println("File exists.");
            } else {
                System.out.println("File does not exist.");
            }

            // Read content from the file
            String readContent = readFromFile(filename);
            System.out.println("Content read from file: " + readContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }


    // Method to write content to a file
    public static void writeToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }

    // Method to read content from a file
    public static String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    // Method to check if a file exists
    public static boolean fileExists(String filename) {
        return Files.exists(Paths.get(filename));
    }
}

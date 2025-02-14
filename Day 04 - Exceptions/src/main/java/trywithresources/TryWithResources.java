package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        // Use try-with-resources to ensure BufferedReader is closed automatically
        try (BufferedReader bfr = new BufferedReader(new FileReader("info.txt"))) {
            // Read the first line of the file
            String line = bfr.readLine();

            // Print the first line of the file
            System.out.println(line);

        } catch (IOException e) {
            // Handle any IOException that may occur and print an error message
            System.out.println("Error reading file. " + e.getMessage());
        }
    }
}

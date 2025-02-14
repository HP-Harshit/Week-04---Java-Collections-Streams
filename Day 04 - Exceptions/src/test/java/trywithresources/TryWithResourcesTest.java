package trywithresources;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TryWithResourcesTest {

    String filename = "infoTest.txt";
    String nonExistingFile = "nonexistent.txt";

    @Test
    public void testReadFile_FileExists() {
        // Create a file named info.txt with some content
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("This is the first line.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // File exists
        assertDoesNotThrow(() -> TryWithResources.main(new String[]{}), "File should be read successfully.");
    }

    @Test
    public void testReadFile_FileDoesNotExist() {
        // Ensure the file does not exist
        File file = new File(nonExistingFile);
        if (file.exists()) {
            file.delete();
        }

        // Use try-with-resources to ensure BufferedReader is closed automatically
        try (BufferedReader bfr = new BufferedReader(new FileReader(nonExistingFile))) {
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

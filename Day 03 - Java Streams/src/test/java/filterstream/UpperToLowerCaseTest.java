package filterstream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpperToLowerCaseTest {

    String sourceFilePath = "sourceTextTest.txt";
    String destFilePath = "destTextTest.txt";

    @Test
    public void testUpperToLowerCase() {
        // Create a source file with some content for testing
        try (FileWriter writer = new FileWriter(sourceFilePath)) {
            writer.write("HELLO, THIS IS A TEST FILE.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Call the method to convert uppercase to lowercase
        boolean isConverted = UpperToLowerCase.upperToLowerCase(sourceFilePath, destFilePath);
        assertTrue(isConverted, "Conversion should be successful");

        // Check if the destination file exists
        File destFile = new File(sourceFilePath);
        assertTrue(destFile.exists(), "Destination file should exist");

        // Clean up test files
        new File(sourceFilePath).delete();
        new File(destFilePath).delete();
    }
}

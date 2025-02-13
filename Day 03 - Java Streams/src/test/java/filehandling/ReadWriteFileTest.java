package filehandling;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadWriteFileTest {

    private static final String sourceFile = "readFileTest.txt";
    private static final String destFile = "writeFileTest.txt";

    @Test
    public void testFileCopy() {
        // Create a source file with some content for testing
        try (FileOutputStream fos = new FileOutputStream(sourceFile)) {
            fos.write("Hello, this is a test file.".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Call the main method to perform file copy
        assertTrue(ReadWriteFile.copyFile(sourceFile, destFile));

        // Check if the destination file exists
        File destFiles = new File(destFile);
        assertTrue(destFiles.exists(), "Destination file should exist");

        // Clean up test files
        new File(sourceFile).delete();
        new File(destFile).delete();
    }
}

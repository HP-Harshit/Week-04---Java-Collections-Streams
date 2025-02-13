package bufferedstreams;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EfficientFileCopyTest {

    String sourceFile = "readFileEfficientlyTest.txt";
    String destBufferedFile = "writeBufferedFileEfficiently.txt";
    String destUnbufferedFile = "writeUnbufferedFileEfficiently.txt";

    @Test
    public void testFileCopy() {
        // Create a source file with some content for testing
        try (FileOutputStream fos = new FileOutputStream(sourceFile)) {
            fos.write("Hello, this is a test file.".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Call the main method to perform file copy
        assertTrue(EfficientFileCopy.efficientFileCopy(sourceFile, destBufferedFile));
        assertTrue(EfficientFileCopy.unbufferedFileCopy(sourceFile, destUnbufferedFile));

        // Check if the destination file exists
        File destBufferedFiles = new File(destBufferedFile);
        assertTrue(destBufferedFiles.exists(), "Destination Buffered file should exist");
        File destUnBufferedFiles = new File(destUnbufferedFile);
        assertTrue(destUnBufferedFiles.exists(), "Destination UnBuffered file should exist");

        // Clean up test files
        new File(sourceFile).delete();
        new File(destBufferedFile).delete();
    }
}

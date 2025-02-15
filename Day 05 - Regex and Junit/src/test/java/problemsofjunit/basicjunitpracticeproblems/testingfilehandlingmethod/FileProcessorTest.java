package problemsofjunit.basicjunitpracticeproblems.testingfilehandlingmethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessorTest {
    String testFile = "testfile.txt";
    String content = "Hello, World!";

    @BeforeEach
    void setup() throws IOException {
        // Ensure the test file is clean before each test
        Files.deleteIfExists(Paths.get(testFile));
    }

    @AfterEach
    void teardown() throws IOException {
        // Clean up the test file after each test
        Files.deleteIfExists(Paths.get(testFile));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        // Write content to the file
        FileProcessor.writeToFile(testFile, content);

        // Read content from the file
        String actualContent = FileProcessor.readFromFile(testFile);

        // Verify the content is written and read correctly
        assertEquals(content, actualContent);
    }

    @Test
    void testFileExists() throws IOException {
        // Write content to the file
        FileProcessor.writeToFile(testFile, content);

        // Verify the file exists
        assertTrue(FileProcessor.fileExists(testFile));
    }

    @Test
    void testReadFileIOException() {
        // Try to read from a non-existent file and verify IOException is thrown
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistentfile.txt"));
    }
}

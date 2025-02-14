package checkedexception;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CompileTimeExceptionTest {

    private static final String existingFile = "existingFileTest.txt";
    private static final String nonExistingFile = "nonExistingFile.txt";

    @BeforeAll
    public static void setUp() throws IOException {
        // Create a file named existingFile.txt and write some content to it
        try (FileWriter writer = new FileWriter(existingFile)) {
            writer.write("Sample content for testing.");
        }
    }

    @AfterAll
    public static void tearDown() {
        // Delete the existingFile.txt after tests are done
        new File(existingFile).delete();
    }

    @Test
    public void testReadFile_FileExists() {
        // Test case: File exists
        assertTrue(CompileTimeException.readFile(existingFile), "File should be read successfully.");
    }

    @Test
    public void testReadFile_FileDoesNotExist() {
        // Test case: File does not exist
        assertFalse(CompileTimeException.readFile(nonExistingFile), "File should not be found.");
    }
}

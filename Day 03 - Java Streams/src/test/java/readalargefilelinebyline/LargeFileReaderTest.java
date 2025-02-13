package readalargefilelinebyline;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargeFileReaderTest {

    @Test
    public void testReadFile() throws IOException {
        // Create a temporary file
        File tempFile = Files.createTempFile("largefile", ".txt").toFile();
        tempFile.deleteOnExit();

        // Write test content to the temporary file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("This is a test line.\n");
            writer.write("This line contains an error.\n");
            writer.write("Another test line.\n");
            writer.write("Second error line here.\n");
        }

        // List to store lines containing "error"
        List<String> errorLines = new ArrayList<>();

        // Read the file and capture lines containing "error"
        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    errorLines.add(line);
                }
            }
        }

        // Expected lines containing "error"
        List<String> expectedLines = List.of(
                "This line contains an error.",
                "Second error line here."
        );

        // Assert that the captured lines match the expected lines
        assertEquals(expectedLines, errorLines);
    }
}

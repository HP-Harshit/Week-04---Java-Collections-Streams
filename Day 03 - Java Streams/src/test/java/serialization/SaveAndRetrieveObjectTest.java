package serialization;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SaveAndRetrieveObjectTest {

    private static final String FILE_NAME = "employees.ser";

    @Test
    public void testSerialization() {
        // Test the serialization method
        boolean isSerialized = SaveAndRetrieveObject.serialization();
        assertTrue(isSerialized, "Serialization should be successful");

        // Check if the file has been created
        File file = new File(FILE_NAME);
        assertTrue(file.exists(), "Serialized file should exist");

        // Clean up test file
        file.delete();
    }

    @Test
    public void testDeserialization() {
        // Ensure the file exists by calling the serialization method
        SaveAndRetrieveObject.serialization();

        // Test the deserialization method
        boolean isDeserialized = SaveAndRetrieveObject.deserialization();
        assertTrue(isDeserialized, "Deserialization should be successful");

        // Clean up test file
        File file = new File(FILE_NAME);
        file.delete();
    }
}

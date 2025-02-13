package datastreams;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreAndRetrieveDataTest {

    String filePath = "studentDetails.dat";

    @Test
    public void testStoreStudentDetails() {
        // Test the storeStudentDetails method
        boolean isStored = StoreAndRetrieveData.storeStudentDetails(filePath);
        assertTrue(isStored, "Storage should be successful");

        // Check if the file has been created
        File file = new File(filePath);
        assertTrue(file.exists(), "Binary file should exist");
    }

    @Test
    public void testRetrieveStudentDetails() {
        // Ensure the file exists by calling the storeStudentDetails method
        StoreAndRetrieveData.storeStudentDetails(filePath);

        // Test the retrieveStudentDetails method
        boolean isRetrieved = StoreAndRetrieveData.retrieveStudentDetails(filePath);
        assertTrue(isRetrieved, "Retrieval should be successful");

        // Clean up the test file
        new File(filePath).delete();
    }
}

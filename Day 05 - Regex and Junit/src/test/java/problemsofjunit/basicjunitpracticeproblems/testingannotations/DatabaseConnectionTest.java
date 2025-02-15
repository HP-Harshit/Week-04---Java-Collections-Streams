package problemsofjunit.basicjunitpracticeproblems.testingannotations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    // Setup method to initialize the DatabaseConnection object and connect before each test
    @BeforeEach
    void setup() {
        dbConnection = new DatabaseConnection();
        DatabaseConnection.connect();
    }

    // Teardown method to disconnect after each test
    @AfterEach
    void teardown() {
        DatabaseConnection.disconnect();
    }

    // Test method to verify that the connection is established
    @Test
    void testConnectionEstablished() {
        // Check if the connection is established
        assertTrue(DatabaseConnection.isConnected());
    }

    // Test method to verify that the connection is closed
    @Test
    void testConnectionClosed() {
        // Disconnect and check if the connection is closed
        DatabaseConnection.disconnect();
        assertFalse(DatabaseConnection.isConnected());
    }
}

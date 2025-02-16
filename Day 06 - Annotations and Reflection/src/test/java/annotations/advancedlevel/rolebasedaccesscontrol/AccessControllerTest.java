package annotations.advancedlevel.rolebasedaccesscontrol;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AccessControllerTest {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    // Set up the output stream to capture System.out output
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    // Restore the original System.out
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    // Test for admin access to performAdminTask method
    @Test
    public void testAdminAccess() throws Exception {
        SecureService service = new SecureService();
        User adminUser = new User("Alice", "ADMIN");

        AccessController.invokeMethod(service, "performAdminTask", adminUser);
        assertEquals("Admin task performed.", outContent.toString());
    }

    // Test for non-admin access to performAdminTask method
    @Test
    public void testNonAdminAccess() throws Exception {
        SecureService service = new SecureService();
        User normalUser = new User("Bob", "USER");

        AccessController.invokeMethod(service, "performAdminTask", normalUser);
        assertEquals("Access Denied! User Bob does not have the required role.", outContent.toString());
    }

    // Test for user access to performUserTask method
    @Test
    public void testUserAccess() throws Exception {
        SecureService service = new SecureService();
        User normalUser = new User("Bob", "USER");

        AccessController.invokeMethod(service, "performUserTask", normalUser);
        assertEquals("User task performed.", outContent.toString());
    }
}

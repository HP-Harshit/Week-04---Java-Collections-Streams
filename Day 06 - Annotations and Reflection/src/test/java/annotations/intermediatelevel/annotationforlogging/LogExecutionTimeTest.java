package annotations.intermediatelevel.annotationforlogging;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LogExecutionTimeTest {

    // Stream to capture system output
    ByteArrayOutputStream outContent;
    PrintStream originalOut = System.out;

    // Set up the streams to capture output before each test
    @BeforeEach
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    // Test for the performTaskA method
    @Test
    public void testPerformTaskA() throws Exception {
        ProjectManager projectManager = new ProjectManager();
        MethodExecutionLogger.logExecutionTime(projectManager);
        String output = outContent.toString();
        assertTrue(output.contains("performTaskA executed in"));
    }

    // Test for the performTaskB method
    @Test
    public void testPerformTaskB() throws Exception {
        ProjectManager projectManager = new ProjectManager();
        MethodExecutionLogger.logExecutionTime(projectManager);
        String output = outContent.toString();
        assertTrue(output.contains("performTaskB executed in"));
    }

    // Test for the performTaskC method
    @Test
    public void testPerformTaskC() throws Exception {
        ProjectManager projectManager = new ProjectManager();
        MethodExecutionLogger.logExecutionTime(projectManager);
        String output = outContent.toString();
        assertTrue(output.contains("performTaskC executed in"));
    }
}

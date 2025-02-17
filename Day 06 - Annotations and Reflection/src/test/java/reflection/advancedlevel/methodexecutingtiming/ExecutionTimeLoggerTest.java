package reflection.advancedlevel.methodexecutingtiming;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExecutionTimeLoggerTest {

    @Test
    public void testLogExecutionTime() {
        // Create an instance of ExampleClass
        ExampleClass example = new ExampleClass();

        // Capture the system output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Log the execution time of methods
        ExecutionTimeLogger.logExecutionTime(example, "method1");
        ExecutionTimeLogger.logExecutionTime(example, "method2");
        ExecutionTimeLogger.logExecutionTime(example, "method3");

        // Get the output as a string
        String output = outContent.toString();

        // Verify that the execution time is logged
        assertTrue(output.contains("method1 executed in"), "Execution time should be logged for method1");
        assertTrue(output.contains("Method1 executed"), "Method result should be printed");
        assertTrue(output.contains("method2 executed in"), "Execution time should be logged for method1");
        assertTrue(output.contains("Method3 executed"), "Method result should be printed");
        assertTrue(output.contains("method3 executed in"), "Execution time should be logged for method1");
        assertTrue(output.contains("Method3 executed"), "Method result should be printed");
    }
}

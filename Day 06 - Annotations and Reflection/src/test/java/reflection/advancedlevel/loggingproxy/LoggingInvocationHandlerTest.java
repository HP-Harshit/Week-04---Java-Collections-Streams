package reflection.advancedlevel.loggingproxy;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggingInvocationHandlerTest {

    @Test
    public void testLoggingInvocationHandler() {
        // Create an instance of the target class
        GreetingImplement greetingImpl = new GreetingImplement();

        // Capture the system output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                GreetingImplement.class.getClassLoader(),
                GreetingImplement.class.getInterfaces(),
                new LoggingInvocationHandler(greetingImpl)
        );

        // Call the method on the proxy instance
        proxyInstance.sayHello();

        // Get the output as a string
        String output = outContent.toString();

        // Verify that the method name is logged before execution
        assertTrue(output.contains("Invoking method: sayHello"), "Method name should be logged before execution");
        assertTrue(output.contains("Hello, World!"), "Method result should be printed");
    }
}

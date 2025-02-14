package exceptionpropagation;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class ExceptionPropagationTest {

    @Test
    public void testExceptionPropagation() {
        // Ensure the exception is propagated and handled in main
        assertDoesNotThrow(() -> ExceptionPropagation.main(new String[]{}),
                "Exception should be handled in main");
    }
}

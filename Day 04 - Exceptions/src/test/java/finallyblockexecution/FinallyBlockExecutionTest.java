package finallyblockexecution;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;

public class FinallyBlockExecutionTest {

    ByteArrayInputStream testIn;

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void testValidDivision() {
        provideInput("10\n2\n");
        assertDoesNotThrow(() -> FinallyBlockExecution.main(new String[]{}));
    }

    @Test
    public void testDivisionByZero() {
        provideInput("10\n0\n");
        assertDoesNotThrow(() -> FinallyBlockExecution.main(new String[]{}));
    }
}

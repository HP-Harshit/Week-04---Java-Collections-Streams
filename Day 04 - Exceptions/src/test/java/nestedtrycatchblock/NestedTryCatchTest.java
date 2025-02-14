package nestedtrycatchblock;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class NestedTryCatchTest {
    private ByteArrayInputStream testIn;

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void testValidInput() {
        provideInput("1\n2\n3\n4\n5\n2\n4\n");
        assertDoesNotThrow(() -> NestedTryCatch.main(new String[]{}));
    }

    @Test
    public void testDivisionByZero() {
        provideInput("1\n2\n3\n4\n5\n0\n2\n");
        assertDoesNotThrow(() -> NestedTryCatch.main(new String[]{}));
    }

    @Test
    public void testInvalidArrayIndex() {
        provideInput("1\n2\n3\n4\n5\n2\n7\n");
        assertDoesNotThrow(() -> NestedTryCatch.main(new String[]{}));
    }
}

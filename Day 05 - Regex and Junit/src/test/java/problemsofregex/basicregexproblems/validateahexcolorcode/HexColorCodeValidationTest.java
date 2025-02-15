package problemsofregex.basicregexproblems.validateahexcolorcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HexColorCodeValidationTest {
    @Test
    void testValidHexColorCodes() {
        assertTrue(HexColorCodeValidation.isValidHexColorCode("#FFA500"));
        assertTrue(HexColorCodeValidation.isValidHexColorCode("#ff4500"));
        assertTrue(HexColorCodeValidation.isValidHexColorCode("#123ABC"));
    }

    @Test
    void testInvalidHexColorCodes() {
        assertFalse(HexColorCodeValidation.isValidHexColorCode("#123")); // Too short
        assertFalse(HexColorCodeValidation.isValidHexColorCode("FFA500")); // Missing #
        assertFalse(HexColorCodeValidation.isValidHexColorCode("#GHIJKL")); // Invalid characters
        assertFalse(HexColorCodeValidation.isValidHexColorCode("#1234567")); // Too long
    }
}

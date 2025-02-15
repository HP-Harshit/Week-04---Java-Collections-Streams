package problemsofjunit.advancejunitpracticeproblems.testingdateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

public class DateFormatterTest {
    @Test
    void testValidDates() {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"));
        assertEquals("21-07-2021", DateFormatter.formatDate("2021-07-21"));
    }

    @Test
    void testInvalidDates() {
        assertThrows(DateTimeParseException.class, () -> DateFormatter.formatDate("21-07-2021"));
        assertThrows(DateTimeParseException.class, () -> DateFormatter.formatDate("2025/02/15"));
    }
}

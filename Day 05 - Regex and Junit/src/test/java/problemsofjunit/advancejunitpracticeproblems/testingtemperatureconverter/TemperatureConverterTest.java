package problemsofjunit.advancejunitpracticeproblems.testingtemperatureconverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        // Test conversion from Celsius to Fahrenheit
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100));
        assertEquals(77.0, TemperatureConverter.celsiusToFahrenheit(25));
    }

    @Test
    void testFahrenheitToCelsius() {
        // Test conversion from Fahrenheit to Celsius
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32));
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212));
        assertEquals(25.0, TemperatureConverter.fahrenheitToCelsius(77));
    }
}

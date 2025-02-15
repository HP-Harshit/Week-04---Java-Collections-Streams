package problemsofregex.advancedproblems.validateanipaddress;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IPAddressValidationTest {

    // Test method to check valid IP addresses
    @Test
    void testValidIPAddresses() {
        // Assert that a valid IP address "192.168.1.1" returns true
        assertTrue(IPAddressValidation.isValidIPAddress("192.168.1.1"));

        // Assert that a valid IP address "0.0.0.0" returns true
        assertTrue(IPAddressValidation.isValidIPAddress("0.0.0.0"));

        // Assert that a valid IP address "255.255.255.255" returns true
        assertTrue(IPAddressValidation.isValidIPAddress("255.255.255.255"));

        // Assert that a valid IP address "123.45.67.89" returns true
        assertTrue(IPAddressValidation.isValidIPAddress("123.45.67.89"));
    }

    // Test method to check invalid IP addresses
    @Test
    void testInvalidIPAddresses() {
        // Assert that an invalid IP address "256.256.256.256" returns false
        assertFalse(IPAddressValidation.isValidIPAddress("256.256.256.256")); // Out of range values

        // Assert that an invalid IP address "123.321.0.12" returns false
        assertFalse(IPAddressValidation.isValidIPAddress("123.321.0.12")); // Invalid number

        // Assert that an invalid IP address "999.999.999.999" returns false
        assertFalse(IPAddressValidation.isValidIPAddress("999.999.999.999")); // Out of range values

        // Assert that an invalid IP address "123.45.678.90" returns false
        assertFalse(IPAddressValidation.isValidIPAddress("123.45.678.90")); // Out of range values
    }
}

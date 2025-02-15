package problemsofregex.advancedproblems.validateacreditcardnumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CreditCardValidationTest {

    // Test method to check valid Visa card numbers
    @Test
    void testValidVisaCardNumbers() {
        // Assert that a valid Visa card number "4111111111111111" returns true
        assertTrue(CreditCardValidation.validateCreditCard("4111111111111111"));

        // Assert that a valid Visa card number "4000000000000002" returns true
        assertTrue(CreditCardValidation.validateCreditCard("4000000000000002"));
    }

    // Test method to check valid MasterCard numbers
    @Test
    void testValidMasterCardNumbers() {
        // Assert that a valid MasterCard number "5500000000000004" returns true
        assertTrue(CreditCardValidation.validateCreditCard("5500000000000004"));

        // Assert that a valid MasterCard number "5100000000000000" returns true
        assertTrue(CreditCardValidation.validateCreditCard("5100000000000000"));
    }

    // Test method to check invalid card numbers
    @Test
    void testInvalidCardNumbers() {
        // Assert that an invalid card number "1234567890123456" returns false
        assertFalse(CreditCardValidation.validateCreditCard("1234567890123456")); // Invalid number

        // Assert that an invalid card number "4111111111111" returns false
        assertFalse(CreditCardValidation.validateCreditCard("4111111111111")); // Too short

        // Assert that an invalid card number "55000000000000000" returns false
        assertFalse(CreditCardValidation.validateCreditCard("55000000000000000")); // Too long

        // Assert that an invalid card number "6000000000000000" returns false
        assertFalse(CreditCardValidation.validateCreditCard("6000000000000000")); // Not Visa or MasterCard
    }
}

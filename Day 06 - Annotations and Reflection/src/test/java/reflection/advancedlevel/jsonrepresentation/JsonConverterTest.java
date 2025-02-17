package reflection.advancedlevel.jsonrepresentation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonConverterTest {

    @Test
    public void testToJson() {
        // Create a Person object
        Person person = new Person("Alice", 30);

        // Convert the Person object to a JSON-like string
        String jsonString = JsonConverter.toJson(person);

        // Verify the JSON-like string
        assertEquals("{\"name\": \"Alice\", \"age\": 30}", jsonString, "The JSON-like string should match the expected value");
    }
}

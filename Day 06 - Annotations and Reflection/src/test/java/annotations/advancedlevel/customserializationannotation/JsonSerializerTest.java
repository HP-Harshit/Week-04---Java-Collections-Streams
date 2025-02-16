package annotations.advancedlevel.customserializationannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonSerializerTest {

    // Test for serializing a User object to JSON string
    @Test
    public void testSerialize() throws IllegalAccessException {
        User user = new User("john_doe", "john.doe@example.com");
        String jsonString = JsonSerializer.serialize(user);
        assertEquals("{\"user_email\": \"john.doe@example.com\", \"user_name\": \"john_doe\"}", jsonString);
    }
}

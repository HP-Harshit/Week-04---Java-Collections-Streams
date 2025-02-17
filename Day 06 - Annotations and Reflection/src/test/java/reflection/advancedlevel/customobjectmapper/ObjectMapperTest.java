package reflection.advancedlevel.customobjectmapper;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObjectMapperTest {

    @Test
    public void testToObject() {
        // Create a map of properties
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alice");
        properties.put("age", 30);

        // Convert the map to a Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Verify the field values
        assertEquals("Alice", person.getName(), "Name should be 'Alice'");
        assertEquals(30, person.getAge(), "Age should be 30");
    }
}

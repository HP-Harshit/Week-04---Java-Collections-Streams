package reflection.advancedlevel.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Create a map of properties
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alice");
        properties.put("age", 30);

        // Convert the map to a Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Print the Person object
        System.out.println(person);
    }
}

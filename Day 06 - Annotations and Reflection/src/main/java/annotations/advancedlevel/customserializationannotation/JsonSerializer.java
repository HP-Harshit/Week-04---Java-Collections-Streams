package annotations.advancedlevel.customserializationannotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

    // Serialize an object to JSON string by reading @JsonField annotations
    public static String serialize(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass(); // Get the class of the object
        Map<String, String> jsonElements = new HashMap<>(); // Map to hold JSON key-value pairs

        // Iterate over all declared fields of the class
        for (Field field : clazz.getDeclaredFields()) {
            // Check if the field is annotated with @JsonField
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true); // Make the field accessible
                JsonField jsonField = field.getAnnotation(JsonField.class); // Get the @JsonField annotation
                jsonElements.put(jsonField.name(), (String) field.get(obj)); // Add key-value pair to the map
            }
        }

        // Build JSON string from the map
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{");
        int count = 0;
        for (Map.Entry<String, String> entry : jsonElements.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\"");
            count++;
            if (count < jsonElements.size()) {
                jsonString.append(", ");
            }
        }
        jsonString.append("}");

        return jsonString.toString(); // Return the JSON string
    }
}

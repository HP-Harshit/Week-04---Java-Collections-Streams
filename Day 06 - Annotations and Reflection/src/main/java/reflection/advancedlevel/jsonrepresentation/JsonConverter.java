package reflection.advancedlevel.jsonrepresentation;

import java.lang.reflect.Field;

public class JsonConverter {

    // Convert an object to a JSON-like string representation
    public static String toJson(Object obj) {
        // StringBuilder to build the JSON string
        StringBuilder json = new StringBuilder();
        json.append("{");

        // Get the class of the object
        Class<?> clazz = obj.getClass();
        // Get all declared fields of the class
        Field[] fields = clazz.getDeclaredFields();

        // Iterate over all fields
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            // Make the field accessible
            field.setAccessible(true);

            try {
                // Get the field name and value
                String fieldName = field.getName();
                Object fieldValue = field.get(obj);

                // Append the field name and value to the JSON string
                json.append("\"").append(fieldName).append("\": ");

                // Check if the field value is a String
                if (fieldValue instanceof String) {
                    json.append("\"").append(fieldValue).append("\"");
                } else {
                    json.append(fieldValue);
                }

                // Add a comma if it's not the last field
                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}"); // End the JSON object
        return json.toString(); // Return the JSON string
    }
}


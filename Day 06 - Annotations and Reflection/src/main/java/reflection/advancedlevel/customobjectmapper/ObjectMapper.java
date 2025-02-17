package reflection.advancedlevel.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create an instance of the given class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate over the map and set the fields
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                // Get the field by name
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true); // Make the field accessible

                // Set the field value
                field.set(instance, fieldValue);
            }

            return instance;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


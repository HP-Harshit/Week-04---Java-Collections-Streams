package reflection.intermediatelevel.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            // Access the private static field API_KEY using reflection
            Field apiKeyField = Configuration.class.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);

            // Print the original value of API_KEY
            String originalApiKey = (String) apiKeyField.get(null);
            System.out.println("Original API_KEY: " + originalApiKey);

            // Modify the value of the private static field API_KEY
            apiKeyField.set(null, "new_api_key");

            // Print the modified value of API_KEY
            String modifiedApiKey = (String) apiKeyField.get(null);
            System.out.println("Modified API_KEY: " + modifiedApiKey);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

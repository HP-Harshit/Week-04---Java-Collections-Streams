package reflection.intermediatelevel.accessandmodifystaticfields;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigurationTest {

    @Test
    public void testModifyStaticField() throws Exception {
        // Access the private static field API_KEY using reflection
        Field apiKeyField = Configuration.class.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        // Modify the value of the private static field API_KEY
        apiKeyField.set(null, "new_api_key");

        // Retrieve the modified value of API_KEY
        String modifiedApiKey = (String) apiKeyField.get(null);

        // Verify the modified value
        assertEquals("new_api_key", modifiedApiKey, "API_KEY should be modified to 'new_api_key'");
    }
}

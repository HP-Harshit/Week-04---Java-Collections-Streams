package reflection.intermediatelevel.accessandmodifystaticfields;

public class Configuration {

    // Private static field API_KEY
    private static String API_KEY = "initial_api_key";

    // Getter for API_KEY
    public static String getApiKey() {
        return API_KEY;
    }
}

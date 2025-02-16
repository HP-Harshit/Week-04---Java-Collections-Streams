package annotations.advancedlevel.customserializationannotation;

public class Main {

    public static void main(String[] args) {
        // Create a User instance with username and email
        User user = new User("john_doe", "john.doe@example.com");

        try {
            // Serialize the User object to JSON string
            String jsonString = JsonSerializer.serialize(user);
            // Print the JSON string
            System.out.println(jsonString);
        } catch (IllegalAccessException e) {
            // Handle any exceptions that occur during serialization
            e.printStackTrace();
        }
    }
}

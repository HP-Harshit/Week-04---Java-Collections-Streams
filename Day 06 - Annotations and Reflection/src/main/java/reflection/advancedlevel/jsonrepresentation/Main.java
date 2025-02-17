package reflection.advancedlevel.jsonrepresentation;

public class Main {

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);

        // Convert the Person object to a JSON-like string
        String jsonString = JsonConverter.toJson(person);

        // Print the JSON-like string
        System.out.println(jsonString);
    }
}

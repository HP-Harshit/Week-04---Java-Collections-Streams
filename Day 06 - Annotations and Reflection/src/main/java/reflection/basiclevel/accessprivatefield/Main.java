package reflection.basiclevel.accessprivatefield;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person(25);

        try {
            // Access the private field age using reflection
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);

            // Retrieve the value of the private field age
            int age = (int) ageField.get(person);
            System.out.println("Original age: " + age);

            // Modify the value of the private field age
            ageField.set(person, 30);

            // Retrieve the modified value of the private field age
            age = (int) ageField.get(person);
            System.out.println("Modified age: " + age);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

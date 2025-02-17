package reflection.basiclevel.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        String className = "reflection.basiclevel.getclassinformation.ExampleClass";

        try {
            // Load the class
            Class<?> cls = Class.forName(className);

            // Display class name
            System.out.println("Class Name: " + cls.getName());

            // Display methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(" - " + method);
            }

            // Display fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(" - " + field);
            }

            // Display constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(" - " + constructor);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}

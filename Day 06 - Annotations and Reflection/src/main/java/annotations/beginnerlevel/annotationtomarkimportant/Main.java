package annotations.beginnerlevel.annotationtomarkimportant;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Get all methods from the ProjectManager class
            Method[] methods = ProjectManager.class.getDeclaredMethods();

            // Loop through all methods
            for (Method method : methods) {
                // Check if the method is annotated with @ImportantMethod
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    // Retrieve the annotation
                    ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);

                    // Print the method name and importance level
                    System.out.println("Method: " + method.getName() + ", Importance Level: " + importantMethod.level());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

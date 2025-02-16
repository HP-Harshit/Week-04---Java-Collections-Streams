package annotations.beginnerlevel.todoannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Get all methods from the ProjectManager class
            Method[] methods = ProjectManager.class.getDeclaredMethods();

            // Loop through all methods
            for (Method method : methods) {
                // Check if the method is annotated with @Todo
                if (method.isAnnotationPresent(Todo.class)) {
                    // Retrieve the annotation
                    Todo todo = method.getAnnotation(Todo.class);

                    // Print the task details
                    System.out.println("Method: " + method.getName() +
                            "\nTask: " + todo.task() +
                            "\nAssigned To: " + todo.assignedTo() +
                            "\nPriority: " + todo.priority() +
                            "\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

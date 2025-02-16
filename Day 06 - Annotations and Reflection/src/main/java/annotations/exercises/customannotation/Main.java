package annotations.exercises.customannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the methods from the TaskManager class
            Method highPriorityTaskMethod = TaskManager.class.getMethod("highPriorityTask");
            Method mediumPriorityTaskMethod = TaskManager.class.getMethod("mediumPriorityTask");

            // Check if the methods are annotated with @TaskInfo
            if (highPriorityTaskMethod.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve the annotation
                TaskInfo taskInfo = highPriorityTaskMethod.getAnnotation(TaskInfo.class);

                // Print the annotation details
                System.out.println("High Priority Task - Priority: " + taskInfo.priority() + ", Assigned To: " + taskInfo.assignedTo());
            }

            if (mediumPriorityTaskMethod.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve the annotation
                TaskInfo taskInfo = mediumPriorityTaskMethod.getAnnotation(TaskInfo.class);

                // Print the annotation details
                System.out.println("Medium Priority Task - Priority: " + taskInfo.priority() + ", Assigned To: " + taskInfo.assignedTo());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

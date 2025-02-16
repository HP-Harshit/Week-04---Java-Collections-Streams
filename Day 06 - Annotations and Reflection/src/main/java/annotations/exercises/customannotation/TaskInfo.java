package annotations.exercises.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface TaskInfo {
    int priority(); // Define the priority field
    String assignedTo(); // Define the assignedTo field
}

package annotations.beginnerlevel.todoannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    // Description of the task
    String task();
    // Developer responsible
    String assignedTo();
    // Priority of the task, default is "MEDIUM"
    String priority() default "MEDIUM";
}

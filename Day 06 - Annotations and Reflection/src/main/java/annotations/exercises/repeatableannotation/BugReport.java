package annotations.exercises.repeatableannotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
public @interface BugReport {
    String description();
}

package annotations.exercises.repeatableannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}

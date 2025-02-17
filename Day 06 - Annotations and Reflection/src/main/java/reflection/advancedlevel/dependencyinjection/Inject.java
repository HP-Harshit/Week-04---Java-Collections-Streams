package reflection.advancedlevel.dependencyinjection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the custom annotation @Inject
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}


package reflection.intermediatelevel.retrieveannotationsatruntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the custom annotation @Author
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}


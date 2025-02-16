package annotations.intermediatelevel.maxlengthannotation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    // Constructor to initialize the username and validate its length
    public User(String username) throws IllegalArgumentException {
        this.username = username;
        validateMaxLength();
    }

    // Validate the length of fields annotated with @MaxLength
    private void validateMaxLength() throws IllegalArgumentException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                try {
                    field.setAccessible(true);
                    String value = (String) field.get(this);
                    if (value != null && value.length() > maxLength.value()) {
                        throw new IllegalArgumentException("Field " + field.getName() + " exceeds maximum length of " + maxLength.value());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Getter for the username
    public String getUsername() {
        return username;
    }
}

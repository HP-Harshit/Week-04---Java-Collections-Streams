package annotations.advancedlevel.customserializationannotation;

public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters for username and email
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

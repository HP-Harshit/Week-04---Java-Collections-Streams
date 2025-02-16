package annotations.advancedlevel.rolebasedaccesscontrol;

public class User {
    private String username;
    private String role;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    // Getter for the username
    public String getUsername() {
        return username;
    }

    // Getter for the role
    public String getRole() {
        return role;
    }
}

package annotations.intermediatelevel.maxlengthannotation;

public class Main {
    public static void main(String[] args) {
        try {
            // Valid username
            User user1 = new User("JohnDoe");
            System.out.println("Username: " + user1.getUsername());

            // Invalid username (length exceeds 10)
            User user2 = new User("JohnDoe12345"); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

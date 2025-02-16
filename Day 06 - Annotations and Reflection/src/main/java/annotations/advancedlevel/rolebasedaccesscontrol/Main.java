package annotations.advancedlevel.rolebasedaccesscontrol;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create an instance of SecureService
        SecureService service = new SecureService();

        // Create an admin user
        User adminUser = new User("Alice", "ADMIN");

        // Create a normal user
        User normalUser = new User("Bob", "USER");

        // Attempt admin task as Alice
        System.out.println("Attempting to perform admin task as Alice:");
        AccessController.invokeMethod(service, "performAdminTask", adminUser);
        System.out.println();

        // Attempt admin task as Bob
        System.out.println("Attempting to perform admin task as Bob:");
        AccessController.invokeMethod(service, "performAdminTask", normalUser);
        System.out.println();

        // Attempt user task as Bob
        System.out.println("Attempting to perform user task as Bob:");
        AccessController.invokeMethod(service, "performUserTask", normalUser);
    }
}

package problemsofjunit.basicjunitpracticeproblems.testingannotations;

public class DatabaseConnection {
    private static boolean isConnected;

    // Main method to demonstrate connecting and disconnecting
    public static void main(String[] args) {
        System.out.println("Is database connected: " + isConnected());

        // Connect to the database and print the connection status
        connect();
        System.out.println("Is database connected: " + isConnected());

        // Disconnect from the database and print the connection status
        disconnect();
        System.out.println("Is database connected: " + isConnected());
    }

    // Method to establish a database connection
    public static void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    // Method to close the database connection
    public static void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    // Method to check if the connection is established
    public static boolean isConnected() {
        return isConnected;
    }
}

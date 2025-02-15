package problemsofjunit.basicjunitpracticeproblems.performancetestingusingtimeout;

public class PerformanceTimeout {
    public static void main(String[] args) {
        // Call the longRunningTask method
        long result = longRunningTask();
        System.out.println("Task completed with result: " + result);
    }

    // Method that simulates a long-running task by sleeping for 3 seconds
    public static long longRunningTask() {
        try {
            // Sleep for 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis();
    }
}

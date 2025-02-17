package reflection.advancedlevel.methodexecutingtiming;

import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void logExecutionTime(Object obj, String methodName) {
        try {
            // Get the method by name and parameter types
            Method method = obj.getClass().getMethod(methodName);

            // Record the start time
            long startTime = System.nanoTime();

            // Invoke the method
            method.invoke(obj);

            // Record the end time
            long endTime = System.nanoTime();

            // Calculate the execution time
            long executionTime = endTime - startTime;

            // Log the execution time
            System.out.println(methodName + " executed in " + executionTime + " nanoseconds");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

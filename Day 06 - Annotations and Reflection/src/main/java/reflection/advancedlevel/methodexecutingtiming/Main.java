package reflection.advancedlevel.methodexecutingtiming;

public class Main {

    public static void main(String[] args) {
        // Create an instance of ExampleClass
        ExampleClass example = new ExampleClass();

        // Log the execution time of methods
        ExecutionTimeLogger.logExecutionTime(example, "method1");
        ExecutionTimeLogger.logExecutionTime(example, "method2");
        ExecutionTimeLogger.logExecutionTime(example, "method3");
    }
}

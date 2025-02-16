package annotations.intermediatelevel.annotationforlogging;

import java.lang.reflect.Method;

public class MethodExecutionLogger {

    public static void logExecutionTime(Object obj) throws Exception {
        Method[] methods = obj.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(obj);
                long endTime = System.nanoTime();

                System.out.println(method.getName() + " executed in " + (endTime - startTime) + " ns");
            }
        }
    }
}

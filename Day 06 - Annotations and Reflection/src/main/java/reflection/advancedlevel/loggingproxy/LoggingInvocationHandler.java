package reflection.advancedlevel.loggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log the method name
        System.out.println("Invoking method: " + method.getName());
        // Invoke the actual method on the target object
        return method.invoke(target, args);
    }
}

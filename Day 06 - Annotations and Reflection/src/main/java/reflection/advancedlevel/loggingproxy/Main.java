package reflection.advancedlevel.loggingproxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        // Create an instance of the target class
        GreetingImplement greetingImpl = new GreetingImplement();

        // Create a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                GreetingImplement.class.getClassLoader(),
                GreetingImplement.class.getInterfaces(),
                new LoggingInvocationHandler(greetingImpl)
        );

        // Call the method on the proxy instance
        proxyInstance.sayHello();
    }
}

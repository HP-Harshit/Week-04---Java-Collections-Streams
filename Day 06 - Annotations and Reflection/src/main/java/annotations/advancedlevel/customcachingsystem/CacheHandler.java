package annotations.advancedlevel.customcachingsystem;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler {

    private static final Map<String, Object> cache = new HashMap<>(); // Cache to store results

    // Invoke a method on the given object and cache the result if @CacheResult is present
    public static Object invokeMethod(Object obj, String methodName, Object... args) throws Exception {
        Method method = obj.getClass().getMethod(methodName, int.class); // Get the method by name
        if (method.isAnnotationPresent(CacheResult.class)) { // Check if the method is annotated with @CacheResult
            String key = generateKey(methodName, args); // Generate a unique key for the cache
            if (cache.containsKey(key)) {
                return cache.get(key); // Return cached result
            } else {
                Object result = method.invoke(obj, args); // Invoke the method
                cache.put(key, result); // Store result in cache
                return result;
            }
        } else {
            return method.invoke(obj, args); // Invoke the method if not annotated with @CacheResult
        }
    }

    // Generate a unique key for the cache based on the method name and arguments
    private static String generateKey(String methodName, Object... args) {
        StringBuilder key = new StringBuilder(methodName);
        for (Object arg : args) {
            key.append(":").append(arg.toString());
        }
        return key.toString();
    }
}

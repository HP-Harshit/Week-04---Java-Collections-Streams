package reflection.advancedlevel.dependencyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {

    private Map<Class<?>, Object> instances = new HashMap<>();

    // Register a class and its instance
    public <T> void register(Class<T> clazz) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            instances.put(clazz, instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Inject dependencies into the specified class instance
    public <T> T injectDependencies(Class<T> clazz) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    Object dependency = instances.get(field.getType());
                    field.setAccessible(true);
                    field.set(instance, dependency);
                }
            }

            return instance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

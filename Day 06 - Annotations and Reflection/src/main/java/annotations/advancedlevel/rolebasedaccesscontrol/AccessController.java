package annotations.advancedlevel.rolebasedaccesscontrol;

import java.lang.reflect.Method;

public class AccessController {

    // Invoke a method on the given object based on the user's role
    public static void invokeMethod(Object obj, String methodName, User user) throws Exception {
        Method method = obj.getClass().getMethod(methodName); // Get the method by name
        if (method.isAnnotationPresent(RoleAllowed.class)) { // Check if the method is annotated with @RoleAllowed
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class); // Get the @RoleAllowed annotation
            if (roleAllowed.value().equals(user.getRole())) { // Check if the user's role matches the required role
                method.invoke(obj); // Invoke the method
            } else {
                System.out.print("Access Denied! User " + user.getUsername() + " does not have the required role.");// Access denied message
            }
        } else {
            // Invoke the method if not annotated with @RoleAllowed
            method.invoke(obj);
        }
    }
}

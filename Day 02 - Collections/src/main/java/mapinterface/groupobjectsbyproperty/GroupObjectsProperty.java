package mapinterface.groupobjectsbyproperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupObjectsProperty {
    public static void main(String[] args) {
        // Create Employee objects
        Employee e1 = new Employee("Alice", "HR");
        Employee e2 = new Employee("Bob", "IT");
        Employee e3 = new Employee("Carol", "HR");

        // Create a list of employees
        List<Employee> employees = new ArrayList<>(List.of(e1, e2, e3));

        // Group employees by department
        Map<String, List<String>> emp = groupEmployee(employees);

        // Print the grouped employees
        System.out.println(emp);
    }

    // Method to group employees by department
    public static Map<String, List<String>> groupEmployee(List<Employee> employees){
        // Create a map to hold the grouped employees
        Map<String, List<String>> emp = new HashMap<>();

        // Iterate through the list of employees
        for(Employee employee : employees){
            // If the department is not already in the map, add it with a new list
            if(!emp.containsKey(employee.getDept())){
                emp.put(employee.getDept(), new ArrayList<>());
            }

            // Add the employee to the corresponding department list
            emp.get(employee.getDept()).add(employee.getName());
        }

        // Return the grouped employees map
        return emp;
    }
}

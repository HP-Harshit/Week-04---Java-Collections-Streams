package mapinterface.groupobjectsbyproperty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupObjectsPropertyTest {

    // Test method for grouping employees by department
    @Test
    void testGroupEmployee() {
        // Create Employee objects
        Employee e1 = new Employee("Alice", "HR");
        Employee e2 = new Employee("Bob", "IT");
        Employee e3 = new Employee("Carol", "HR");

        // Create a list of employees
        List<Employee> employees = new ArrayList<>(List.of(e1, e2, e3));

        // Group employees by department
        Map<String, List<String>> actualGroupedEmployees = GroupObjectsProperty.groupEmployee(employees);

        // Expected grouped employees map
        Map<String, List<String>> expectedGroupedEmployees = new HashMap<>();
        expectedGroupedEmployees.put("HR", new ArrayList<>(List.of(e1.getName(), e3.getName())));
        expectedGroupedEmployees.put("IT", new ArrayList<>(List.of(e2.getName())));

        // Assert that the actual grouped employees map matches the expected map
        Assertions.assertEquals(expectedGroupedEmployees, actualGroupedEmployees);
    }
}

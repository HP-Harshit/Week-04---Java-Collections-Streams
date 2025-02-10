package multileveluniversitycoursemanagementsystem;

import java.util.List;

public class Utility {

    // Method to display evaluation details for all courses in the list
    public static void displayAllCourses(List<? extends CourseType> courses) {

        // Loop through each course in the list
        for (CourseType course : courses) {

            // Call the evaluation method to display details about the course
            course.evaluation();
        }
    }
}

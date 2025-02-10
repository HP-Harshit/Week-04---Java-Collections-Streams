package multileveluniversitycoursemanagementsystem;

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {

        // Creating instances of specific courses
        ExamCourse maths = new ExamCourse("Maths");
        AssignmentCourse english = new AssignmentCourse("English");
        ResearchCourse computerScience = new ResearchCourse("Computer Science Research");

        // Creating storage for each type of course
        Course<ExamCourse> examCourse = new Course<>();
        Course<AssignmentCourse> assignmentCourse = new Course<>();
        Course<ResearchCourse> researchCourse = new Course<>();

        // Adding courses to their respective storage
        examCourse.addCourse(maths);
        assignmentCourse.addCourse(english);
        researchCourse.addCourse(computerScience);

        // Displaying all courses in each storage
        Utility.displayAllCourses(examCourse.getCourses());
        Utility.displayAllCourses(assignmentCourse.getCourses());
        Utility.displayAllCourses(researchCourse.getCourses());
    }
}

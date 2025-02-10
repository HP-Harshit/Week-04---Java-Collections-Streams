package multileveluniversitycoursemanagementsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class UniversityCourseManagementSystemTest {

    // Test for the ExamCourse class
    @Test
    void testExamCourse() {
        ExamCourse maths = new ExamCourse("Maths");
        assertEquals("Maths", maths.getCourseName());
        maths.evaluation();
    }

    // Test for the AssignmentCourse class
    @Test
    void testAssignmentCourse() {
        AssignmentCourse english = new AssignmentCourse("English");
        assertEquals("English", english.getCourseName());
        english.evaluation();
    }

    // Test for the ResearchCourse class
    @Test
    void testResearchCourse() {
        ResearchCourse computerScience = new ResearchCourse("Computer Science Research");
        assertEquals("Computer Science Research", computerScience.getCourseName());
        computerScience.evaluation();
    }

    // Test for the Course class
    @Test
    void testCourse() {
        Course<ExamCourse> examCourse = new Course<>();
        ExamCourse maths = new ExamCourse("Maths");
        examCourse.addCourse(maths);
        List<ExamCourse> courses = examCourse.getCourses();
        assertEquals(1, courses.size());
        assertEquals(maths, courses.get(0));
    }

    // Test for the Utility class
    @Test
    void testUtility() {
        Course<ExamCourse> examCourse = new Course<>();
        ExamCourse maths = new ExamCourse("Maths");
        examCourse.addCourse(maths);

        Course<AssignmentCourse> assignmentCourse = new Course<>();
        AssignmentCourse english = new AssignmentCourse("English");
        assignmentCourse.addCourse(english);

        Course<ResearchCourse> researchCourse = new Course<>();
        ResearchCourse computerScience = new ResearchCourse("Computer Science Research");
        researchCourse.addCourse(computerScience);

        Utility.displayAllCourses(examCourse.getCourses());
        Utility.displayAllCourses(assignmentCourse.getCourses());
        Utility.displayAllCourses(researchCourse.getCourses());
    }
}

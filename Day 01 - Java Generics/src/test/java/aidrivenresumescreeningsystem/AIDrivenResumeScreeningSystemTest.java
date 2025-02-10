package aidrivenresumescreeningsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AIDrivenResumeScreeningSystemTest {

    // Test for the SoftwareEngineer class
    @Test
    void testSoftwareEngineer() {
        SoftwareEngineer se = new SoftwareEngineer("Alice");
        assertEquals("Alice", se.getCandidateName());
        se.displayRole();  // This will print: Software Engineer: Alice
    }

    // Test for the DataScientist class
    @Test
    void testDataScientist() {
        DataScientist ds = new DataScientist("Bob");
        assertEquals("Bob", ds.getCandidateName());
        ds.displayRole();  // This will print: Data Scientist: Bob
    }

    // Test for the ProductManager class
    @Test
    void testProductManager() {
        ProductManager pm = new ProductManager("Charlie");
        assertEquals("Charlie", pm.getCandidateName());
        pm.displayRole();  // This will print: Product Manager: Charlie
    }

    // Test for the Resume class
    @Test
    void testResume() {
        Resume<SoftwareEngineer> seResume = new Resume<>();
        SoftwareEngineer se = new SoftwareEngineer("Alice");
        seResume.addResumes(se);
        List<SoftwareEngineer> resumes = seResume.getResumes();
        assertEquals(1, resumes.size());
        assertEquals(se, resumes.get(0));
    }

    // Test for the Utility class
    @Test
    void testUtility() {
        Resume<SoftwareEngineer> seResume = new Resume<>();
        SoftwareEngineer se = new SoftwareEngineer("Alice");
        seResume.addResumes(se);

        Resume<DataScientist> dsResume = new Resume<>();
        DataScientist ds = new DataScientist("Bob");
        dsResume.addResumes(ds);

        Resume<ProductManager> pmResume = new Resume<>();
        ProductManager pm = new ProductManager("Charlie");
        pmResume.addResumes(pm);

        // This will print: Software Engineer: Alice
        Utility.displayAllResumes(seResume.getResumes());
        // This will print: Data Scientist: Bob
        Utility.displayAllResumes(dsResume.getResumes());
        // This will print: Product Manager: Charlie
        Utility.displayAllResumes(pmResume.getResumes());
    }
}

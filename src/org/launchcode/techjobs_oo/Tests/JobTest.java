package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    Job testJobOne;
    Job testJobTwo;
    Employer acme = new Employer();
    Employer lockerdome = new Employer();
    Location desert = new Location();
    Location saintLouis = new Location();
    PositionType qualityControl = new PositionType();
    PositionType dataScientist = new PositionType();
    CoreCompetency persistence = new CoreCompetency();
    CoreCompetency statisticalAnalysis = new CoreCompetency();



    @Before
    public void createTestJobs() {
        testJobOne = new Job("Product tester", acme, desert, qualityControl, persistence);
        testJobTwo = new Job("Junior Data Analyst", lockerdome, saintLouis, dataScientist, statisticalAnalysis);
    }

    @Test
    public void testSettingJobId() {
        assertFalse(testJobOne.getId() == testJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));
       //assertTrue(testJobThree.getName() instanceof Job); - Do I need to check the class of testJobThree.getName()?
        assertTrue(testJobThree.getEmployer() instanceof Employer);
        assertTrue(testJobThree.getLocation() instanceof Location);
        assertTrue(testJobThree.getPositionType() instanceof PositionType);
        assertTrue(testJobThree.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", testJobThree.getName());
        assertEquals(testJobThree.getEmployer().getValue(), "ACME");
        assertEquals(testJobThree.getLocation().getValue(), "Desert");
        assertEquals(testJobThree.getPositionType().getValue(), "Quality control");
        assertEquals(testJobThree.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJobOne.equals(testJobTwo));
    }


}

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

    @Test
    public void testSettingJobId() {
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
        testJobOne = new Job("Product tester", acme, desert, qualityControl, persistence);
        testJobTwo = new Job("Junior Data Analyst", lockerdome, saintLouis, dataScientist, statisticalAnalysis);

        assertFalse(testJobOne.getId() == testJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));

        System.out.println(testJobThree.getId());
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
        testJobOne = new Job("Product tester", acme, desert, qualityControl, persistence);
        testJobTwo = new Job("Product tester", acme, desert, qualityControl, persistence);

        assertFalse(testJobOne.equals(testJobTwo));
    }

    @Test
    public void jobClassToStringMethodWorks() {
        Job testJobOne;
        Employer acme = new Employer("ACME");
        Location desert = new Location("Desert");
        PositionType qualityControl = new PositionType("Quality control");
        CoreCompetency persistence = new CoreCompetency("Persistence");
        testJobOne = new Job("Product tester", acme, desert, qualityControl, persistence);

        assertEquals("\nID: 1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" + "" +
                "Core Competency: Persistence\n", testJobOne.toString());
    }

    @Test
    public void jobClassToStringMethodWorksWithEmptyConstructors() {
        Job testJobOne;
        Employer acme = new Employer();
        Location desert = new Location();
        PositionType qualityControl = new PositionType();
        CoreCompetency persistence = new CoreCompetency();
        testJobOne = new Job("Test Job", acme, desert, qualityControl, persistence);

        //Why is this expecting 4?? Aren't the variables all local to the tests?
        assertEquals("\nID: 4\n" +
                "Name: Test Job\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" + "" +
                "Core Competency: Data not available\n", testJobOne.toString());

    }

    @Test
    public void jobClassToStringMethodWorksWithEmptyStringsInConstructors() {
        Job testJobOne;
        Employer acme = new Employer("");
        Location desert = new Location("");
        PositionType qualityControl = new PositionType("");
        CoreCompetency persistence = new CoreCompetency("");
        testJobOne = new Job("Test Job", acme, desert, qualityControl, persistence);

        //Why is this expecting 4?? Aren't the variables all local to the tests?
        assertEquals("\nID: 6\n" +
                "Name: Test Job\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" + "" +
                "Core Competency: Data not available\n", testJobOne.toString());

    }

//    @Test
//    public void onlyIdDataReturnsDataNotAvailable() {
//        Job testJob = new Job();
//
//        assertEquals("OOPS! This job does not seem to exist.", testJob.toString());
//    }
 //Design patterns

}

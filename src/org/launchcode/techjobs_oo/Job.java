package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        String idString = "ID: " + this.getId();
        String nameString = "Name: " + this.getName();
        String employerString = "Employer: " + this.getEmployer().getValue();
        String locationString = "Location: " + this.getLocation().getValue();
        String positionString = "Position Type: " + this.getPositionType().getValue();
        String coreCompetencyString = "Core Competency: " + this.getCoreCompetency().getValue();

        if (this.getId() < 0) {
            idString = "ID: Data not available";
        }

        if (this.getName() == null) {
            nameString = "Name: Data not available";
        }

        if (this.getEmployer().getValue() == null) {
            employerString = "Employer: Data not available";
        }

        if (this.getLocation().getValue() == null) {
            locationString = "Location: Data not available";
        }

        if (this.getPositionType().getValue() == null) {
            positionString = "Position Type: Data not available";
        }

        if (this.getCoreCompetency().getValue() == null) {
            coreCompetencyString = "Core Competency: Data not available";
        }

        if (this.getName() == "") {
            nameString = "Name: Data not available";
        }

        if (this.getEmployer().getValue() == "") {
            employerString = "Employer: Data not available";
        }

        if (this.getLocation().getValue() == "") {
            locationString = "Location: Data not available";
        }

        if (this.getPositionType().getValue() == "") {
            positionString = "Position Type: Data not available";
        }

        if (this.getCoreCompetency().getValue() == "") {
            coreCompetencyString = "Core Competency: Data not available";
        }

//        if (this.getName() == " " && this.getEmployer().getValue() == null
//                && this.getEmployer().getValue() == null && this.getPositionType().getValue() == null
//                && this.getCoreCompetency().getValue() == null) {
//            return "OOPS! This job does not seem to exist.";
//        } else {

            return ("\n" + idString + "\n" +
                    nameString + "\n" +
                    employerString + "\n" +
                    locationString + "\n" +
                    positionString + "\n" +
                    coreCompetencyString + "\n");
        }
    }



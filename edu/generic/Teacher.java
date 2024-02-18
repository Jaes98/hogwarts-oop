package edu.generic;

import edu.generic.Person;

import java.time.*;


public class Teacher extends Person {
    String employment;
    LocalDate employmentStart;
    LocalDate employmentEnd;

    public Teacher(String lastName, String firstName, String middleName, String employment, String employmentStart, String employmentEnd) {
        super(lastName, firstName, middleName);
        this.employment = employment;
        this.employmentStart = LocalDate.parse(employmentStart);
        this.employmentEnd = LocalDate.parse(employmentEnd);
    }
    public Teacher() {}

    // public boolean isEmployment() {
    //     return this.employment;
    // }

    // public void setEmployment(boolean employment) {
    //     this.employment = employment;
    // }

    // public Date getEmploymentStart() {
    //     return this.employmentStart;
    // }

    // public void setEmploymentStart(Date employmentStart) {
    //     this.employmentStart = employmentStart;
    // }

    // public Date getEmploymentEnd() {
    //     return this.employmentEnd;
    // }

    // public void setEmploymentEnd(Date employmentEnd) {
    //     this.employmentEnd = employmentEnd;
    // }
}
package edu.generic;

import edu.generic.Person;

public class Student extends Person {
    int enrollmentYear;
    int graduationYear;
    boolean graduated;

    public Student(String lastName, String firstName, String middleName, int enrollmentYear, int graduationYear, boolean graduated) {
        super(lastName, firstName, middleName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }
     public Student() {
     }

     public int getEnrollmentYear() {
         return enrollmentYear;
     }

     public void setEnrollmentYear(int enrollmentYear) {
         this.enrollmentYear = enrollmentYear;
     }

     public int getGraduationYear() {
         return graduationYear;
     }

     public void setGraduationYear(int graduationYear) {
         this.graduationYear = graduationYear;
     }

     public boolean isGraduated() {
         return graduated;
     }

    public void setGraduated(boolean graduated) {
         this.graduated = graduated;
     }

    public String toString() {
        return super.toString() + " " + enrollmentYear + " " + graduationYear + " " + graduated;
    }
}
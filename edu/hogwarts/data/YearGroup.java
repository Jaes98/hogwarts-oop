package edu.hogwarts.data;

import edu.generic.Student;
import edu.hogwarts.data.HogwartsStudent;

import java.util.Date;

public class YearGroup extends HogwartsStudent {
    int schoolYear;
    Date beginningOfSchoolYear;
    Student[] students;

    public YearGroup(String lastName, String firstName, String middleName, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String[] teams, int schoolYear, Date beginningOfSchoolYear, Student[] students) {
        super(lastName, firstName, middleName, enrollmentYear, graduationYear, graduated, house, prefect, teams);
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = students;
    }

    public YearGroup(int schoolYear, Date beginningOfSchoolYear, Student[] students) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = students;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Date getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(Date beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
import java.util.Date;

public class YearGroup extends HogwartsStudent {
    int schoolYear;
    Date beginningOfSchoolYear;
    Student[] students;

    public YearGroup(String name, int enrollmentYear, House house, int schoolYear, Date beginningOfSchoolYear, Student[] students) {
        super(name, enrollmentYear, house);
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = students;
    }

    public int getSchoolYear() {
        return this.schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Date getBeginningOfSchoolYear() {
        return this.beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(Date beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
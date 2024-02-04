public class Student extends Person {
    int enrollmentYear;
    int graduationYear;
    boolean graduated;

    public Student(String firstName, String middleName, String lastName, String fullName, int enrollmentYear) {
        super(firstName, middleName, lastName, fullName);
        this.enrollmentYear = enrollmentYear;
    }
    public Student(String fullName) {
        setFullName(fullName);
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
}
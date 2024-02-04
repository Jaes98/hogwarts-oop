import java.util.Date;

public class Teacher extends Person {
    boolean employment;
    Date employmentStart;
    Date employmentEnd;

    public Teacher(String fullName, boolean employment, Date employmentStart, Date employmentEnd) {
        super(fullName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public boolean isEmployment() {
        return this.employment;
    }

    public void setEmployment(boolean employment) {
        this.employment = employment;
    }

    public Date getEmploymentStart() {
        return this.employmentStart;
    }

    public void setEmploymentStart(Date employmentStart) {
        this.employmentStart = employmentStart;
    }

    public Date getEmploymentEnd() {
        return this.employmentEnd;
    }

    public void setEmploymentEnd(Date employmentEnd) {
        this.employmentEnd = employmentEnd;
    }
}
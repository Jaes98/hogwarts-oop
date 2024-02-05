public class Subject extends Course {
    String name;
    int schoolYear;
    boolean elective;

    public Subject(String name, int schoolYear, boolean elective) {
        this.name = name;
        this.schoolYear = schoolYear;
        this.elective = elective;
    }
    public Subject() {
        
    }
}

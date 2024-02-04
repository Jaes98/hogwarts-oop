public class HogwartsTeacher extends Teacher {
    House house;
    boolean headOfHouse;

    public HogwartsTeacher(String lastName, String firstName, String middleName, String employment, String employmentStart, String employmentEnd, House house, boolean headOfHouse) {
        super(lastName, firstName, middleName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }
    // public HogwartsTeacher(String fullName) {
    //     setFullName(fullName);
    // }
    public HogwartsTeacher() {
    }

    // public House getHouse() {
    //     return this.house;
    // }

    // public void setHouse(House house) {
    //     this.house = house;
    // }

    // public boolean isHeadOfHouse() {
    //     return this.headOfHouse;
    // }

    // public void setHeadOfHouse(boolean headOfHouse) {
    //     this.headOfHouse = headOfHouse;
    // }
}

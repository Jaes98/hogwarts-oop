package edu.hogwarts.data;

import edu.generic.Teacher;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {
    House house;
    boolean headOfHouse;

    public HogwartsTeacher(String lastName, String firstName, String middleName, String employment, String employmentStart, String employmentEnd, House house, boolean headOfHouse) {
        super(lastName, firstName, middleName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }
    // public edu.hogwarts.data.HogwartsTeacher(String fullName) {
    //     setFullName(fullName);
    // }
    public HogwartsTeacher() {
    }

    // public edu.hogwarts.data.House getHouse() {
    //     return this.house;
    // }

    // public void setHouse(edu.hogwarts.data.House house) {
    //     this.house = house;
    // }

    // public boolean isHeadOfHouse() {
    //     return this.headOfHouse;
    // }

    // public void setHeadOfHouse(boolean headOfHouse) {
    //     this.headOfHouse = headOfHouse;
    // }
}

package edu.hogwarts.data;

import edu.generic.Teacher;

public class HogwartsTeacher extends Teacher {
    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String lastName, String firstName, String middleName, String employment, String employmentStart, String employmentEnd, House house, boolean headOfHouse) {
        super(lastName, firstName, middleName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher() {
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    public String toString() {
        return get
    }
}

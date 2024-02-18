package edu.hogwarts.data;

import edu.generic.Student;

public class HogwartsStudent extends Student implements HogwartsPerson {
    House house;
    boolean prefect;
    String[] teams;

        public HogwartsStudent(String lastName, String firstName, String middleName, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
            super(lastName, firstName, middleName, enrollmentYear, graduationYear, graduated);
            this.house = house;
            this.prefect = prefect;
            this.teams = teams;
        }
        public HogwartsStudent() {
        }

        // public edu.hogwarts.data.House getHouse() {
        //     return this.house;
        // }

        // public void setHouse(edu.hogwarts.data.House house) {
        //     this.house = house;
        // }

        // public boolean isPrefect() {
        //     return this.prefect;
        // }

        // public void setPrefect(boolean prefect) {
        //     this.prefect = prefect;
        // }

        // public String[] getTeams() {
        //     return this.teams;
        // }

        // public void setTeams(String[] teams) {
        //     this.teams = teams;
        // }
}

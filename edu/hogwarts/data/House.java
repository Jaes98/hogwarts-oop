package edu.hogwarts.data;

public class House implements HogwartsPerson {
    String houseName;
    String founder;
    String[] colors;

    public House(String houseName, String founder, String[] colors) {
        this.houseName = houseName;
        this.founder = founder;
        this.colors = colors;
    }
    public House() {}

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }
}

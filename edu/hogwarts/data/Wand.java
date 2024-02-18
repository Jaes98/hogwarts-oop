package edu.hogwarts.data;

import edu.hogwarts.data.TeachingMaterial;

public class Wand extends TeachingMaterial {
    double lengthInInches;
    String wood;
    String core;

    public Wand(double lengthInInches, String wood, String core) {
        this.lengthInInches = lengthInInches;
        this.wood = wood;
        this.core = core;
    }
    public Wand() {
        
    }

    public double getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(double lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }
}

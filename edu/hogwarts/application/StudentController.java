package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsStudent;

import java.util.HashMap;

public class StudentController {

    private HashMap<Integer, HogwartsStudent> allStudents = new HashMap<>();

    private int idCount = 1;
    public void createStudent(HogwartsStudent newStud) {
        allStudents.put(idCount, new HogwartsStudent(newStud));
        idCount++;
    }

    public HogwartsStudent getStudent(int id) {
        return allStudents.get(id);
    }
}

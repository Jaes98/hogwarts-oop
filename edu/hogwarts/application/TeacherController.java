package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsTeacher;

import java.util.HashMap;

public class TeacherController {
    private HashMap<Integer, HogwartsTeacher> allTeachers = new HashMap<>();

    private int idCount = 1;
    public void createTeacher(HogwartsTeacher newTeacher) {
        allTeachers.put(idCount, new HogwartsTeacher(newTeacher));
        idCount++;
    }

    public HogwartsTeacher getTeacher(int id) {
        return allTeachers.get(id);
    }
}

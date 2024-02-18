package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;

public class Course {
    Subject subject;
    Teacher teacher;
    Student[] students;
    TeachingMaterial[] materials;

    public Course (Subject subject, Teacher teacher, HogwartsStudent[] students, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
    }
    public Course() {}
    public void setTeachers() {
    }
    public void addStudents() {
    }

}

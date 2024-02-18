package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.TeachingMaterial;


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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }

    public void setMaterials(TeachingMaterial[] materials) {
        this.materials = materials;
    }

    public String toString(){
        String studentMsg = "";
        for (Student student : students) {
            studentMsg += student + " ";
        }
        String materialMsg = "";
        for (TeachingMaterial material : materials) {
            materialMsg += material + " ";
        }
        String msg = "\n subject " + subject + "\n teacher " + teacher + "\n teacher " + teacher + "\n students " +studentMsg +
                "\n materials " +materialMsg;
        return msg;
    }
}

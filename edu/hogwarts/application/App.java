package edu.hogwarts.application;

import edu.generic.Person;
import edu.generic.Student;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
    public void start() {
        System.out.println("Hello, world!");
        Person ron = new Person("Ronald", "Weasley", "Weasel");
        Student harry = new Student("Potter", "Harry", "James", 1991, 1998, true);
        // edu.hogwarts.data.HogwartsStudent hStudent = new edu.hogwarts.data.HogwartsStudent("Potter", "Harry", "James", 1991, 1998, true, "Lmao", true, "Yessir");
        System.out.println(harry);
        System.out.println(ron);
        // System.out.println(hStudent.toString());

    }
}

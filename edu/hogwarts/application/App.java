package edu.hogwarts.application;

import edu.generic.Person;
import edu.generic.Student;
import edu.hogwarts.application.UserInterFace;

public class App {
    TeacherController teachController = new TeacherController();
    StudentController studController = new StudentController();
    InitData dataStart;

    public static void main(String[] args) {
        System.out.println("Starten virker!");
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("Det virker da helt vildt godt, for sure!");
        dataStart = new InitData(teachController, studController);
        dataStart.initData();

    }
}

package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.*;

public class InitData {

    TeacherController teachers;
    StudentController students;

    public InitData(TeacherController teachers, StudentController students) {
        this.teachers = teachers;
        this.students = students;
    }

    public void initData(){
        var gryffindor = new House("Gryffindor","Gryffindor Man",new String[] { "Red", "Black", "Gold" }    );
        var slytherin = new House("Slytherin","Slytherin Man",new String[] { "Green", "Black" }    );
        var snape = new HogwartsTeacher("Severus","Snape",null,"Teacher","1991-04-05","1997-11-11",slytherin,true);
        var ron = new HogwartsStudent("Weasley","Ron",null,2002, 2008, true, gryffindor, false, new String[] { "Quidditch" } );
        var harry = new HogwartsStudent("Potter","Harry","James",2002, 2008, true, gryffindor, false, new String[] { "Quidditch", "Dark arts practice" } );
        var tempIngredient = new Ingredient("Oyster", true, false, true, "The treasure of the ocean", 12, "Oyters");

        var testTool = new Tool("Screaming book", true,  true, false, "Dont scream back at it!","Used to be screamed at.");
        var potionSubject = new Subject("Potion making", 2007, true);
        var potionCourse = new Course(potionSubject, snape, new HogwartsStudent[]{harry, ron}, new TeachingMaterial[]{tempIngredient, testTool} );

        System.out.println(potionCourse);

        students.createStudent(harry);
        students.createStudent(ron);
        teachers.createTeacher(snape);

    }

}

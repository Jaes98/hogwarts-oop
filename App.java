import java.time.*;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
    public void start() {
        System.out.println("Hello, world!");
        Person ron = new Person("Ronald", "Weasley", "Weasel");
        Student harry = new Student("Potter", "Harry", "James", 1991, 1998, true);
        // HogwartsStudent hStudent = new HogwartsStudent("Potter", "Harry", "James", 1991, 1998, true, "Lmao", true, "Yessir");
        System.out.println(harry);
        System.out.println(ron);
        // System.out.println(hStudent.toString());

        DynamicArray dArray = new DynamicArray();
        dArray.add("ron");
        dArray.printArray();

    }
}

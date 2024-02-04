import java.time.*;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
    public void start() {
        System.out.println("Hello, world!");
        Student student = new Student("Potter", "James", "Harry", 1991, 1998, true);
        System.out.println(student.toString());
    }
}

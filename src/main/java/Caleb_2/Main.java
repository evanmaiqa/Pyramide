package Caleb_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.fName = "Otto";
        student.lName = "Dakota";
        student.age = 89;

        Teacher teacher = new Teacher("Utee", "Cali");

        List<User> users = new ArrayList<>();
        users.add(student);
        users.add(teacher);

        for (User u : users) {
            u.sayHello();
        }

    }

}

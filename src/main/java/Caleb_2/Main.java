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
        student.sayHello();

        student.status = student.status.probation;
        System.out.println(student.status);

        switch (student.status) {
            case probation:
                System.out.println("Ouch");
                break;
            case active:
                System.out.println("Great!");
                break;
            case inactive:
                System.out.println("come back!");
                break;
        }
    }

}

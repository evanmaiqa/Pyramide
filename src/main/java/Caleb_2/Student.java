package Caleb_2;

public class Student extends User implements Talk {
    public boolean verified = true;
    public double age;

    @Override
    public void sayHello() {
        System.out.println(String.format("Hello! My name major is %s %s %f", fName, lName, age));
    }
}

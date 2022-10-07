package Caleb_2;

public class Teacher extends User{
    public Teacher(String fName, String lName2){
        super.fName = fName;
        lName = lName2;
    }
    @Override
    public void sayHello() {
        System.out.println("I'm Teacher " + fName + lName);
    }
}

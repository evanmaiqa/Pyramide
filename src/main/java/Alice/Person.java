package Alice;

public class Person {
    //    Создать класс в котором будут поля Имя, Возраст, Страна, Зарплата (цифрами просто), образование (Bachelor, PhD и тд).
    private String name;
    private int age;
    private String country;
    private double salary;
    private String education;

    public Person(String name, int age, String country, double salary, String education) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.salary = salary;
        this.education = education;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public double getSalary() {
        return salary;
    }

    public String getEducation() {
        return education;
    }
}

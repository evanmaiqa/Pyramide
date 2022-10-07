public class One {
    private String name;
    private int age;

    private void name_age(String name, int age) {
        this.name  = name;
        this.age = age;
    }

    public static void main(String[] args) {

        One Person0 = new One();
        Person0.name = "Jon";
        Person0.age = 22;

        One Person1 = new One();
        Person1.name = "Ann";
        Person1.age = 21;
    }
}

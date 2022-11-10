import Builder.ReverseDemo;

public class Main {
    public static String convert(boolean b){
        if(b) {
            return "true";
        }
        return "false";
    }
    public static void main(String[] args) {
        System.out.println(convert(false));
    }
}

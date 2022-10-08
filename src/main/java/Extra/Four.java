package Extra;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        int num0 = 9;
//       Extra.One
//        for (int i = num0; i >= 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//      Two
//        String str0 = "";
//        for (int i = num0; i >= 0; i--) {
//            for (int j = i; j >= 0; j--) {
//                System.out.print(j);
//            }
//            str0 += " ";
//            System.out.println();
//            System.out.print(str0);
//        }
//      three
        String str0 = "";
        for (int i = num0; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            str0 += " ";
            System.out.println();
            System.out.print(str0);
        }
        System.out.println();
//      Extra.Four methods
        int a = 9, b = 3;
        System.out.printf("addition %d + %d = " + addition(a, b) + "\n", a, b);
        System.out.printf("subtraction %d + %d = " + subtraction(a, b) + "\n", a, b);
        System.out.printf("multiplication %d * %d = " + multiplication(a, b) + "\n", a, b);
        System.out.printf("division %d / %d = " + division(a, b) + "\n", a, b);
    }
    static int addition (int num0, int num1) {
        return num0 + num1;
    }
    static int subtraction (int num0, int num1) {
        return num0 - num1;
    }
    static int multiplication (int num0, int num1) {
        return num0 * num1;
    }
    static int division (int num0, int num1) {
        return num0 / num1;
    }
    // push
}

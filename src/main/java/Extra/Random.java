package Extra;

import java.util.*;

public class Random {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_0 = scanner.nextInt();

        List<Integer> list_0 = new ArrayList<>();
        for (int i = 0; i < num_0; i++) {
            list_0.add((int)(Math.random() * 100));
        }
        System.out.println(list_0);
        Collections.sort(list_0);
        System.out.println(list_0);

    }
}

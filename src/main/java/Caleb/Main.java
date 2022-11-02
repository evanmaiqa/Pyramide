package Caleb;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=r3GGV2TG_vw&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF
 */
public class Main {

    public static void main(String[] args) {
        User user_0 = new User("Otto", "Rain");
        User user_1 = new User("Anne", "You");
        User user_2 = new User("Link", "Florida");
        User user_3 = new User("Extra.Four", "Alaska");

        List<User> users = new ArrayList<>();
        users.add(user_0);
        users.add(user_1);
        users.add(user_2);

        System.out.println(users.toString());
        // same (without toSting
        System.out.println(users);
        System.out.println("--------------------------");

        System.out.println(user_0.equals(user_1));
        System.out.println(user_0.equals(user_0));
        System.out.println("--------------------------");

        System.out.println(User.searchList(users, "Otto", "Rai"));
        System.out.println(User.searchList(users, "Otto Rain"));
        System.out.println("--------------------------");

        System.out.println(User.findUser(users, user_2));
        System.out.println(User.findUser(users, user_3));
        System.out.println("--------------------------");

    }

}

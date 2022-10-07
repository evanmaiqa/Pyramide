package Caleb;

import java.util.List;

public class User {
    private String fName;
    private String lName;

    public User(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    public String getfName() {
        return fName;
    }
    public String getlName() {
        return lName;
    }
    public String getFullName() {
        return getfName() + " " + getlName();
    }
    public static User findUser(List<User> users, User user) {
        for (User u : users) {
            if (u.equals(user)) {
                return user;
            }
        }
        return null;
    }
    public static int searchList(List<User> users, String fName, String lName) {
        return searchList(users, fName + " " + lName);
    }
    public static int searchList(List<User> users, String fullName){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getFullName().equals(fullName)){
                return 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}

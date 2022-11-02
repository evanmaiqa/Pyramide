package Caleb_2;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    public enum status {active, inactive, probation};

    public status status;
    public String fName;
    public String lName;
    public boolean verified = false;

    public abstract void sayHello();
}

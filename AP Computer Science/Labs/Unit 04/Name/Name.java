
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 09/28/18
//Class - 10th
//Lab  - Name

import static java.lang.System.*;

public class Name {
    private String name;

    public Name() {
        name = "";
    }

    public Name(String s) {
        setName(s);
    }

    public void setName(String s) {
        name = s;
    }

    public String getFirst() {
        String firstName = name.substring(0, name.indexOf(" "));
        return firstName;
    }

    public String getLast() {
        String lastName = name.substring(name.indexOf(" ") + 1, name.length());
        return lastName;
    }

    public String toString() {
        return name;
    }
}

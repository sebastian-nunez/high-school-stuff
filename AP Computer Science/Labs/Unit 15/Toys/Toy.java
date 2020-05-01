// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

public class Toy
{
    private String name;
    private int count;

    public Toy() {
        name = "";
        count = 0;
    }

    public Toy(String nm) {
        name = nm;
    }

    public Toy(String nm, int cnt) {
        name = nm;
        count = cnt;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int cnt) {
        count = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String toString() {
        return name + " " + count;
    }
}

// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

import java.util.ArrayList;

public class ToyStore
{
    private ArrayList<Toy> toyList;

    public ToyStore() {
        toyList = new ArrayList<Toy>();
    }

    public void loadToys(String toys) {
        String[] temp = toys.split(" ");

        ArrayList<String> uniqueToyNames = new ArrayList<String>();
        for (String name: temp) {
            if (!uniqueToyNames.contains(name)) {
                uniqueToyNames.add(name);
            }
        }

        for (String uniqueName: uniqueToyNames) {
            int count = 0;
            for (String name: temp) {
                if (name.equals(uniqueName)) {
                    count++;
                }
            }

            toyList.add(new Toy(uniqueName, count));
        }
    }

    public Toy getThatToy(String nm) {
        for (Toy toy: toyList) {
            if (toy.getName().equals(nm)) {
                return toy;
            }
        }

        return null;
    }

    public String getMostFrequentToy() {
        Toy mostFrequent = toyList.get(0);

        for (Toy toy: toyList) {
            if (toy.getCount() > mostFrequent.getCount()) {
                mostFrequent = toy;
            }
        }

        return mostFrequent.getName();
    }

    public void sortToysByCount() {
        for (int current = 0; current < toyList.size() - 1; current++) {
            int minimum = current;
            for (int next = current + 1; next < toyList.size(); next++) {
                if (toyList.get(next).getCount() < toyList.get(minimum).getCount()) {
                    minimum = next;
                }
            }

            if (minimum != current) {
                Toy oldMinimum = toyList.get(minimum);
                toyList.set(minimum, toyList.get(current));
                toyList.set(current, oldMinimum);
            }
        }
    }

    public String toString() {
        return "" + toyList;
    }
}

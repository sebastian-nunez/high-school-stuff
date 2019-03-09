//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
    private Dog[] pups;

    public Doggies(int size) {
        //point pups at a new arry of Dog
        pups = new Dog[size];
    }

    public void set(int spot, int age, String name) {
        //put a new Dog in the array at spot
        //make sure spot is in bounds
        pups[spot] = new Dog(age, name);
    }

    public String getNameOfOldest() {
        int indexOfOldest = 0;
        for (int i = indexOfOldest; i < pups.length; i++) {
            if (pups[i].getAge() > pups[indexOfOldest].getAge()) {
                indexOfOldest = i;
            }
        }

        return pups[indexOfOldest].getName();
    }

    public String getNameOfYoungest() {
        int indexOfYoungest = 0;
        for (int i = indexOfYoungest; i < pups.length; i++) {
            if (pups[i].getAge() < pups[indexOfYoungest].getAge()) {
                indexOfYoungest = i;
            }
        }

        return pups[indexOfYoungest].getName();
    }

    public String toString() {
        return "" + Arrays.toString(pups);
    }
}
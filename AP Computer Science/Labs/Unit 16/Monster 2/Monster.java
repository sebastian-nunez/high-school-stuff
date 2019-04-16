//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Monster implements Comparable
{
  private int myWeight;
  private int myHeight;
  private int myAge;

  public Monster() {
    myWeight = 0;
    myHeight = 0;
    myAge = 0;
  }

  public Monster(int ht) {
    myHeight = ht;
  }

  public Monster(int ht, int wt) {
    myHeight = ht;
    myWeight = wt;
  }

  public Monster(int ht, int wt, int ag) {
    myHeight = ht;
    myWeight = wt;
    myAge = ag;
  }

  public int getHeight() {
    return myHeight;
  }

  public void setHeight(int ht) {
    myHeight = ht;
  }

  public int getWeight() {
    return myWeight;
  }

  public void setWeight(int wt) {
    myWeight = wt;
  }

  public int getAge() {
    return myAge;
  }

  public void setAge(int ag) {
    myAge = ag;
  }

  public Object clone() {
    return new Monster(myHeight, myWeight, myAge);
  }

  public boolean equals(Object obj) {
    Monster monster = (Monster)(obj);

    return myHeight == monster.getHeight() && myWeight == monster.getWeight() && myAge == monster.getAge();
  }

  public int compareTo(Object obj) {
    Monster rhs = (Monster)obj;

    return Integer.compare(myHeight, rhs.getHeight());
  }

  //write a toString() method
  public String toString() {
    return myHeight + " " + myWeight + " " + myAge;
  }

}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public interface Monster
{
  int getHowBig();

  String getName();

  boolean isBigger(Monster other);

  boolean isSmaller(Monster other);

  boolean namesTheSame(Monster other);
}
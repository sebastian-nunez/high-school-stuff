
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import static java.lang.System.*;

class StringRemover
{
  private String sentence;
  private String remove;

  //add in constructors
  public StringRemover() {
    sentence = remove = "";
  }

  public StringRemover(String s, String rem) {
    setRemover(s, rem);
  }

  public void setRemover(String s, String rem) {
    sentence = s;
    remove = rem;
  }

  public String removeStrings() {
    String cleaned = sentence;
    int locToRemove = cleaned.indexOf(remove);

    while (locToRemove != -1) {
      cleaned = cleaned.substring(0, locToRemove - 1) + cleaned.substring(locToRemove + remove.length());
      locToRemove = cleaned.indexOf(remove);
    }

    return cleaned;
  }

  public String toString() {
    return sentence + " - String to remove " + remove + "\n" + removeStrings();
  }
}

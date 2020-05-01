public class Main
{

    private String input;

    public Main() {
        input = "";
    }

    public Main(String s) {
        setString(s);
    }

    public void setString(String s) {
        input = s;
    }

    public String firstWord() {
        return "The first character of your string is: " + input.substring(0, input.indexOf(" "));
    }

    public String toString() {
        return "String entered: " + input;
    }

}

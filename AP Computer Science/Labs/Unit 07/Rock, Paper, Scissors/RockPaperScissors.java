// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/28/18
// Class - 10th
// Lab - Rock Paper Scissors

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;

    public RockPaperScissors() {
        playChoice = "";
        compChoice = "";

    }

    public RockPaperScissors(String player) {
        setPlayers(playChoice);
    }

    public void setPlayers(String player) {
        if (player.equals("R") || player.equals("P") || player.equals("S")) {
            playChoice = player;
        } else {
            playChoice = "INVALID INPUT";
        }

        int num = (int)(Math.random() * 3);

        switch (num) {
            case 0:
                compChoice = "R";
                break;
            case 1:
                compChoice = "P";
                break;
            case 2:
                compChoice = "S";
                break;
        }
    }

    public String determineWinner() {
        String winner = "";

        if (playChoice.equals(compChoice)) {
            winner = "Draw game!";
        } else if (playChoice.equals("R") && compChoice.equals("P")) {
            winner = "!Computer wins <<Paper covers Rock>>!";
        } else if (playChoice.equals("P") && compChoice.equals("S")) {
            winner = "!Computer wins <<Scissors breaks Rock>>!";
        } else if (playChoice.equals("S") && compChoice.equals("R")) {
            winner = "!Computer wins <<Rock breaks Scissors>>!";
        } else if (playChoice.equals("P") && compChoice.equals("R")) {
            winner = "!Player wins <<Paper covers Rock>>!";
        } else if (playChoice.equals("S") && compChoice.equals("P")) {
            winner = "!Player wins <<Scissors breaks Paper>>!";
        } else if (playChoice.equals("R") && compChoice.equals("S")) {
            winner = "!Player wins <<Rock breaks Scissors>>!";
        }
        return winner;
    }

    public String toString() {
        String output = "player had " + playChoice + "\ncomputer had " + compChoice;
        return output;
    }
}

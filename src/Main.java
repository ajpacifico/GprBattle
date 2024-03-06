import javax.swing.text.AttributeSet;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        //Welcome method
        Method.welcome();

        //Team 1----

        //Ask quantity of player from team 1
        Character[] teamOneArray = Method.teamOne();

        //Select player team 1
        Character selectedPlayerTeamOne = Method.selectionTeamOne(teamOneArray);

        //Team 2----

        //Ask quantity of player from team 2
        Character[] teamtwoArray = Method.teamTwo();

        //Select player team 2
        Character selectedPlayerTeamTwo = Method.selectionTeamTwo(teamtwoArray);

        //Show selected player from team 1 and 2
        System.out.println("Selected player from Team 1 is: " + selectedPlayerTeamOne);
        System.out.println("Selected player from Team 2 is: " + selectedPlayerTeamTwo);

        Character selectedPlayer1 = selectedPlayerTeamOne;
        Character selectedPlayer2 = selectedPlayerTeamTwo;

    }
}
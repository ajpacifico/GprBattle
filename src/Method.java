import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Method {


    public static void welcome(){
        System.out.println("WELCOME TO THE RPG BATLLE!" + "\n");
    }


    //method 1, generating randome names--------------------------------------------------------------------------------
    public static String randomeName(){

        String[] randomNames = {"Dark", "Fire", "Shadow", "Ice", "Storm", "Silver", "Golden", "Crystal", "Dragon",
                "Moon", "Sun", "Star", "Night", "Frost", "Sword", "Elf", "Dwarf", "Magic", "Mystic", "Ancient", "blade",
                "fang", "shield", "bane", "wind", "thorn", "heart", "song", "hunter", "strider", "walker", "watcher",
                "whisper", "dreamer", "rider", "spell", "singer", "keeper", "wanderer", "sentinel"};

        int index= makeRandomeRange(0, randomNames.length - 1);
        String randomeName = randomNames[index];

        return randomeName.toUpperCase(Locale.ROOT) ;
    }
    //method 2, generating randome names--------------------------------------------------------------------------------
    public static int makeRandomeRange(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    //method 3, generating id unique number-----------------------------------------------------------------------------

    public static int [] playerInput(){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the numbers of Warriors: ");
        int warriors = keyboard.nextInt();

        System.out.println("Enter the number of Wizards: ");
        int wizards = keyboard.nextInt();

        int [] arrayPlayers = new int[2];
        arrayPlayers[0] = warriors;
        arrayPlayers[1] = wizards;

        return arrayPlayers;
    }

    //method 4, creating the team with objects and array
    public static Character [] makeTeam(int [] arrayPlayers ){

        Character[] team = new Character[arrayPlayers[0]+arrayPlayers[1]];

        for (int i = 0; i < arrayPlayers[0]; i++){
            Warrior warrior = new Warrior(0, "",0,true,0,0);
            team[i] = warrior;
        }
        for (int i = 0; i < arrayPlayers[1]; i++){
            Wizard wizard = new Wizard(0, "",0,true,0,0) ;
            team[i + arrayPlayers[0]] = wizard ;
        }
        return team;
    }

    //method 5, creating team one
    public static Character [] teamOne(){

        System.out.println("Please select the Warriors and Wizards from Team 1");
        Character[] team1= Method.makeTeam(Method.playerInput());
        System.out.println("The Players from Team 1 are:");
        System.out.println(Arrays.toString(team1));

        return team1;
    }

    //method 6, creating team two
    public static Character [] teamTwo(){

        System.out.println("Please select the Warriors and Wizards from Team 2");
        Character[] team2= Method.makeTeam(Method.playerInput());
        System.out.println("The Players from Team 2 are:");
        System.out.println(Arrays.toString(team2));

        return team2;
    }

    public static Character selectionTeamOne(Character [] teamOneArray ){
        Scanner keyboard = new Scanner(System.in);

        Character [] arrayWarriorsAndWizards = teamOneArray; //ME VIENEN EN UN ARRAY TODOS LOS JUGADORES

        System.out.println("Select team´s 1 Player: ");
        String playerOne = keyboard.next();
        Character selectedPlayerOne = new Character();
        //for each
        for (Character obj : arrayWarriorsAndWizards) {
            if (obj.getName().equals(playerOne)) {
                selectedPlayerOne = obj;
                break;
            } //no puedo hacer else
        }
        return selectedPlayerOne;
    }


    public static Character selectionTeamTwo(Character [] teamTwoArray ){
        Scanner keyboard = new Scanner(System.in);

        Character [] arrayWarriorsAndWizards = teamTwoArray; //ME VIENEN EN UN ARRAY TODOS LOS JUGADORES

        System.out.println("Select team´s 2 Player: ");
        String playerOne = keyboard.next();

        Character selectedPlayerTwo = new Character();
        //for each
        for (Character obj : arrayWarriorsAndWizards) {
            if (obj.getName().equals(playerOne)) {
                selectedPlayerTwo = obj;
                break;
            } //no puedo hacer else
        }
        return selectedPlayerTwo;
    }

}


